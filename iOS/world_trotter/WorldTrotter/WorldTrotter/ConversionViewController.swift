//
//  ConversionViewController.swift
//  WorldTrotter
//
//  Created by Arturo Gomez on 7/30/16.
//  Copyright © 2016 Arturo Gomez. All rights reserved.
//

import UIKit
//
//protocol UITextFieldDelegate: NSObjectProtocol {
//    optional func textFieldShouldBeginEditing(textField: UITextField) -> Bool
//}

class ConversionViewConmtroler: UIViewController {
    @IBOutlet var celsiusLabel:UILabel!
    @IBOutlet var textField:UITextField!
    
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
    
    let numberFortmatter: NSNumberFormatter = {
        let nf = NSNumberFormatter()
        nf.numberStyle = .DecimalStyle
        nf.minimumFractionDigits = 0
        nf.maximumFractionDigits = 1
        return nf
    }()
    
    func updateCelsiusLabel() {
        if let value = celsiusValue {
            //celsiusLabel.text = "\(value)"
            celsiusLabel.text = numberFortmatter.stringFromNumber(value)
        } else {
            celsiusLabel.text = "???"
        }
    }
    
    @IBAction func FareheithTextChanged(textField: UITextField) {
        if let text = textField.text, value = Double(text) {
            farenheithValue = value
        } else {
            farenheithValue = nil
        }
    }
    
    @IBAction func dismissKeyboard(sender: AnyObject){
        textField.resignFirstResponder()
    }
    
    
}
