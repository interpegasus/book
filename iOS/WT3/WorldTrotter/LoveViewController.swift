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
    @IBOutlet var lovreButton: UIButton!
    
    override func viewDidLoad(){
        super.viewDidLoad()
        print("Love ViewController loaded its view")
        let heart = UIBezierPath(heartIn: CGRect(x:160,y:240,width:100,height:150));
        let firstView = UIView(frame: CGRect(x:160,y:240,width:100,height:150))
        firstView.backgroundColor = UIColor.red
        view.addSubview(firstView);
    }
    
    @IBAction func loveButtonAction(_ sender: AnyObject) {
        let loveString :String? = "Love"
        loveLabel.text = loveString
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    override func viewWillAppear(_ animated: Bool) {
        // Set the label's initial alpha
        loveLabel.alpha = 0
    }
    
}



extension UIBezierPath {
    convenience init(heartIn rect: CGRect) {
        self.init()
        
        //Calculate Radius of Arcs using Pythagoras
        let sideOne = rect.width * 0.4
        let sideTwo = rect.height * 0.3
        let arcRadius = sqrt(sideOne*sideOne + sideTwo*sideTwo)/2
        
        //Left Hand Curve
        self.addArc(withCenter: CGPoint(x: rect.width * 0.3, y: rect.height * 0.35), radius: arcRadius, startAngle: 135.degreesToRadians, endAngle: 315.degreesToRadians, clockwise: true)
        
        //Top Centre Dip
        self.addLine(to: CGPoint(x: rect.width/2, y: rect.height * 0.2))
        
        //Right Hand Curve
        self.addArc(withCenter: CGPoint(x: rect.width * 0.7, y: rect.height * 0.35), radius: arcRadius, startAngle: 225.degreesToRadians, endAngle: 45.degreesToRadians, clockwise: true)
        
        //Right Bottom Line
        self.addLine(to: CGPoint(x: rect.width * 0.5, y: rect.height * 0.95))
        
        //Left Bottom Line
        self.close()
    }
}

extension Int {
    var degreesToRadians: CGFloat { return CGFloat(self) * .pi / 180 }
}
