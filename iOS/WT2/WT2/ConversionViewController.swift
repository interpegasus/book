//
//  ViewController.swift
//
//  Created by Arturo Gomez on 10/17/16.
//  Copyright © 2016 Arturo Gomez. All rights reserved.
//

import UIKit

class ConversionViewController: UIViewController, UITextFieldDelegate {
    @IBOutlet var celsiusLabel:UILabel!
    @IBOutlet var textField:UITextField!
    
    // Delegate Implementation on UITextField
    func textField(_ textField: UITextField, shouldChangeCharactersIn range: NSRange, replacementString string: String) -> Bool {
        
        let existingTextHasDecimalSeparator = textField.text?.range(of: ".")
        let replacementTextHasDecimalSeparator = string.range(of: ".")
        
        if existingTextHasDecimalSeparator != nil && replacementTextHasDecimalSeparator != nil {
            return false
        }
        else {
            return true
        }
    }
    
    @IBAction func FareheithTextChanged(textField: UITextField) {
        if let text = textField.text, let number = numberFortmatter.number(from: text) {
            farenheithValue = number.doubleValue
        }
        else {
            farenheithValue = nil
        }
    }
    
    
    @IBAction func dismissKeyboard(sender: AnyObject){
        textField.resignFirstResponder()
    }
    
    var farenheithValue: Double? {
        didSet {
            updateCelsiusLabel()
        }
    }
    
    var celsiusValue: Double? {
        if let value = farenheithValue {
            return (value - 32) * 5/9
        }
        else {
            return nil
        }
    }
    
    let numberFortmatter: NumberFormatter = {
        let nf = NumberFormatter()
        nf.numberStyle = .decimal
        nf.minimumFractionDigits = 0
        nf.maximumFractionDigits = 1
        nf.alwaysShowsDecimalSeparator = true
        return nf
    }()
    
    func updateCelsiusLabel() {
        if let value = celsiusValue {
            celsiusLabel.text = numberFortmatter.string(for: value)
        } else {
            celsiusLabel.text = "???"
        }
    }
    
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

