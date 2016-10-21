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
    
    func textField(_ textField: UITextField, shouldChangeCharactersIn range: NSRange, replacementString string: String) -> Bool {
        
        let currentLocale = Locale.current
        let decimalSeparator =
            (currentLocale as NSLocale).object(forKey: NSLocale.Key.decimalSeparator) as! String
        
        let existingTextHasDecimalSeparator = textField.text?.range(of: decimalSeparator)
        let replacementTextHasDecimalSeparator = string.range(of: decimalSeparator)
        
        if existingTextHasDecimalSeparator != nil && replacementTextHasDecimalSeparator != nil {
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
            celsiusLabel.text = "\(value)"
        } else {
            celsiusLabel.text = "???"
        }
    }
    
    @IBAction func FareheithTextChanged(_ textField: UITextField) {
        if let text = textField.text, let number = numberFortmatter.number(from: text) {
            farenheithValue = number.doubleValue
        }
        else {
            farenheithValue = nil
        }
    }
    
    
    @IBAction func dismissKeyboard(_ sender: AnyObject){
        textField.resignFirstResponder()
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        print("Conversion VC")
    }
    
    override func viewWillAppear(_ animated: Bool) {
        let date = Date()
        let calendar = Calendar(identifier: Calendar.Identifier.gregorian)
        let components = (calendar as NSCalendar?)?.components(.hour, from: date)
        
        let lightColor = UIColor.init(red:0.29,  green:0.53,  blue:0.91, alpha:0.7)
        let darkColor = UIColor.init(red:0.04 ,  green:0.16 ,  blue:0.36 , alpha:0.9)
        if let currentHour = components?.hour {
            switch currentHour {
            case 0...6, 18...23:
                view.backgroundColor = darkColor
                break
            default:
                view.backgroundColor = lightColor
            }
        }
    }

}
