//
//  MapViewController.swift
//  WorldTrotter
//
//  Created by Arturo Gomez on 8/13/16.
//  Copyright © 2016 Arturo Gomez. All rights reserved.
//

import UIKit
import MapKit

class MapViewController : UIViewController {
    
    var mapView: MKMapView!
    
    override func loadView() {
        mapView = MKMapView()
        
        view = mapView
        
        
        let standardString = NSLocalizedString("Standard", comment: "foobar")
        let satelliteString = NSLocalizedString("Satellite", comment: "foobar")
        let hybridString = NSLocalizedString("Hybrid", comment: "foobar")
        
        
        let segmentedControl =
            UISegmentedControl(items: [standardString, satelliteString, hybridString])
        segmentedControl.backgroundColor = UIColor.white
        segmentedControl.selectedSegmentIndex = 0
        
        segmentedControl.backgroundColor = UIColor.white
        segmentedControl.selectedSegmentIndex = 0
        segmentedControl.addTarget(self, action: #selector(MapViewController.mapTypeChanged(segControl:)), for: .valueChanged)
        segmentedControl.translatesAutoresizingMaskIntoConstraints = false
        view.addSubview(segmentedControl)

    }
    
    func mapTypeChanged(segControl: UISegmentedControl) {
        switch segControl.selectedSegmentIndex {
        case 0:
            mapView.mapType = .standard
        case 1:
            mapView.mapType = .hybrid
        case 2:
            mapView.mapType = .satellite
        default:
            break
        }
    }
    
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        print("Map VC")
    }
}
