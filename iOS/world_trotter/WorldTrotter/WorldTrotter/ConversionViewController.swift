//
//  ConversionViewController.swift
//  WorldTrotter
//
//  Created by Arturo Gomez on 7/30/16.
//  Copyright © 2016 Arturo Gomez. All rights reserved.
//

import UIKit

class ConversionViewConmtroler: UIViewController,UITextFieldDelegate {
    @IBOutlet var celsiusLabel:UILabel!
    @IBOutlet var textField:UITextField!
    
    func textField(textField: UITextField, shouldChangeCharactersInRange range: NSRange, replacementString string: String) -> Bool {
        
        print("Current text: \(textField.text)")
        print("Replace text: \(string)")
        
        let existingTextHasDecimalSeparator = textField.text?.rangeOfString(".")
        let replacementTextHasDecimalSeparator = string.rangeOfString(".")

        if string.lowercaseString.rangeOfCharacterFromSet(NSCharacterSet.letterCharacterSet()) != nil {
            return false
        }

        if (existingTextHasDecimalSeparator != nil && replacementTextHasDecimalSeparator != nil) {
            return false
        }
        else {
            return true
        }
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
    
    let numberFortmatter: NSNumberFormatter = {
        let nf = NSNumberFormatter()
        nf.numberStyle = .DecimalStyle
        nf.minimumFractionDigits = 0
        nf.maximumFractionDigits = 1
        nf.alwaysShowsDecimalSeparator = true
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
    
    override func viewDidLoad() {
        super.viewDidLoad()
        print("Conversion VC")
    }
    
    override func viewWillAppear(animated: Bool) {
        let date = NSDate()
        let calendar = NSCalendar(calendarIdentifier: NSCalendarIdentifierGregorian)
        let components = calendar?.components(.Hour, fromDate: date)
        let currentHour = components!.hour
        let lightColor = UIColor.init(red:1.00,  green:1.00,  blue:1.00, alpha:0.7)
        let darkColor = UIColor.init(red:0.20 ,  green:0.20 ,  blue:0.20 , alpha:0.9)
        switch currentHour {
        case 0...6, 18...23:
            view.backgroundColor = darkColor
            break
        default:
            view.backgroundColor = lightColor
        }
    }

}
