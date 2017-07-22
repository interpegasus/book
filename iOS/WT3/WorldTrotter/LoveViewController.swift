//
//  LoveViewController.swift
//  WorldTrotter
//
//  Created by Arturo Gomez on 3/25/17.
//  Copyright © 2017 Big Nerd Ranch. All rights reserved.
//

import UIKit

class LoveViewController: UIViewController  {
    @IBOutlet var loveLabel: UILabel!
    @IBOutlet var loveButton: UIButton!
    
    override func viewDidLoad(){
        super.viewDidLoad()
        loveLabel.textColor = UIColor .blue
        let buttonSampleLabel :String = "Push Me"
        loveButton.setTitle(buttonSampleLabel,for: .normal)
        print("Love ViewController loaded its view")
    }
    
    @IBAction func loveButtonAction(_ sender: AnyObject) {
        let loveString :String = "Love"
        loveLabel.text = loveString
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    override func viewWillAppear(_ animated: Bool) {
        // Set the label's initial alpha
        let viewLoaded :String = "Vie will appear text"
        loveLabel.text = viewLoaded
        loveLabel.alpha = 1
    }
    
}
