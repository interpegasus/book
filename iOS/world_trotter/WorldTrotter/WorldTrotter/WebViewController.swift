//
//  ViewController.swift
//  WorldTrotter
//
//  Created by Arturo Gomez on 7/25/16.
//  Copyright © 2016 Arturo Gomez. All rights reserved.
//

import UIKit
import WebKit

import WebKit

class WebViewController: UIViewController {
    
    var webView: WKWebView!
    
    @IBOutlet var myNewWebView: UIWebView!
    
    override func loadView() {
        
        webView = WKWebView()
        view = webView
        let url = URL(string: "http://www.interpegasus.com")!
        webView.load(URLRequest(url: url))
    }
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        print("WebViewController loaded its view: " + webView.title!)
        
    }


}
