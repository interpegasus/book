//
//  Copyright © 2015 Big Nerd Ranch
//

import UIKit

class PhotosViewController: UIViewController, UICollectionViewDelegate {
    
    @IBOutlet var collectionView: UICollectionView!
    
    var store: PhotoStore!
    let photoDataSource = PhotoDataSource()
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        collectionView.dataSource = photoDataSource
        collectionView.delegate = self
        
        store.fetchRecentPhotos() {
            (photosResult) -> Void in
            
            let sortByDateTaken = NSSortDescriptor(key: "dateTaken", ascending: true)
            let allPhotos = try! self.store.fetchMainQueuePhotos(predicate: nil,
                sortDescriptors: [sortByDateTaken])
            
            NSOperationQueue.mainQueue().addOperationWithBlock() {
                self.photoDataSource.photos = allPhotos
                self.collectionView.reloadSections(NSIndexSet(index: 0))
            }
        }
    }
    
    func collectionView(collectionView: UICollectionView,
        willDisplayCell cell: UICollectionViewCell,
        forItemAtIndexPath indexPath: NSIndexPath) {
            
            let photo = photoDataSource.photos[indexPath.row]
            
            // Download the image data, which could take some time
            store.fetchImageForPhoto(photo, completion: { (result) -> Void in
                
                NSOperationQueue.mainQueue().addOperationWithBlock() {
                    
                    // The index path for the photo might have changed between the
                    // time the request started and finished, so find the most
                    // recent index path
                    
                    // (Note: You will have an error on the next line; you will fix it shortly)
                    let photoIndex = self.photoDataSource.photos.indexOf(photo)!
                    let photoIndexPath = NSIndexPath(forRow: photoIndex, inSection: 0)
                    
                    // When the request finishes, only update the cell if it's still visible
                    if let cell = self.collectionView.cellForItemAtIndexPath(photoIndexPath)
                        as? PhotoCollectionViewCell {
                            cell.updateWithImage(photo.image)
                    }
                }
            })
    }
    
    override func prepareForSegue(segue: UIStoryboardSegue, sender: AnyObject?) {
        if segue.identifier == "showPhoto" {
            if let selectedIndexPath =
                collectionView.indexPathsForSelectedItems()?.first {
                    
                    let photo = photoDataSource.photos[selectedIndexPath.row]
                    
                    let destinationVC =
                    segue.destinationViewController as! PhotoInfoViewController
                    destinationVC.photo = photo
                    destinationVC.store = store
            }
        }
    }
}
