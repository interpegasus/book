//
//  ViewController.swift
//  Quiz3
//
//  Created by Arturo Gomez on 3/23/17.
//  Copyright © 2017 Arturo Gomez. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    
    @IBOutlet var questionLabel: UILabel!
    @IBOutlet var answerLabel: UILabel!
    
    let questions: [String] = ["Fropm what is cognac made?",
                               "What is 7+7",
                               "What is the capital of Vermont",
                               "What is the capital of france",
                               ]
    
    let answers: [String] = ["Grapes",
                             "14",
                             "Montpellier",
                             "Paris"]
    
    var currenQuestionIndex: Int = 0
    
    @IBAction func showNextQuestion(_ sender: AnyObject){
        currenQuestionIndex += 1
        if currenQuestionIndex == questions.count{
            currenQuestionIndex = 0
        }
        let question: String = questions[currenQuestionIndex]
        questionLabel.text = question
        answerLabel.text = "?"
        animateLabelTransition()
    }
    
    @IBAction func showAnswer(_ sender: AnyObject){
        let answer: String = answers[currenQuestionIndex]
        answerLabel.text = answer
    }
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        questionLabel.text = questions[currenQuestionIndex]
        // Do any additional setup after loading the view, typically from a nib.
    }
    
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    func animateLabelTransition() {
        let animationClosure = { () -> Void in
            self.questionLabel.alpha = 1
            self.answerLabel.alpha = 1
            let myColor = UIColor.init(red: 1, green: 0.7, blue: 0.8, alpha: 0.9)
            self.questionLabel.highlightedTextColor = myColor
            
            let myNewColor = UIColor.init(red: 0.7, green: 0.7, blue: 0.7, alpha: 0.9)
            self.answerLabel.highlightedTextColor = myNewColor
        }
        UIView.animate(withDuration: 0.5, animations: animationClosure)
    }
    
    override func viewWillAppear(_ animated: Bool) {
        // Set the label's initial alpha
        questionLabel.alpha = 0
        answerLabel.alpha = 0
    }


}

