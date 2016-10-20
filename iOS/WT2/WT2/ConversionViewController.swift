//
//  ViewController.swift
//
//  Created by Arturo Gomez on 10/17/16.
//  Copyright © 2016 Arturo Gomez. All rights reserved.
//

import UIKit

class ConversionViewController: UIViewController {
    
    override func viewDidLoad() {
        super.viewDidLoad()
        let firstFrame = CGRect(x: 100, y: 500, width: 100, height: 100);
        let frame = UIView(frame: firstFrame);
        frame.backgroundColor = (UIColor.magenta);
        view.addSubview(frame);
        // Do any additional setup after loading the view, typically from a nib.
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    
}

