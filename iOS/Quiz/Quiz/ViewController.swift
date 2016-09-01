//
//  ViewController.swift
//  Quiz
//
//  Created by ruby on 6/21/16.
//  Copyright © 2016 interpegasus. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    @IBOutlet var questionLabel: UILabel!
    @IBOutlet var answerLabel: UILabel!
    
    let questions: [String] = ["Fropm what is cognac made?",
                               "What is 7+7",
                               "What is the capital of Vermont"]
    
    let answers: [String] = ["Grapes",
                               "14",
                               "Montpellier"]
    
    var currenQuestionIndex: Int = 0
    
    @IBAction func showNextQuestion(sender: AnyObject){
        currenQuestionIndex += 1
        if currenQuestionIndex == questions.count{
            currenQuestionIndex = 0
        }
        let question: String = questions[currenQuestionIndex]
        questionLabel.text = question
        answerLabel.text = "?"
        animateLabelTransition()
    }
    
    @IBAction func showAnswer(sender: AnyObject){
        let answer: String = answers[currenQuestionIndex]
        answerLabel.text = answer
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        questionLabel.text = questions[currenQuestionIndex]
    }
    
    func animateLabelTransition() {
        let animationClosure = { () -> Void in
            self.questionLabel.alpha = 1
            self.answerLabel.alpha = 1
            self.questionLabel.highlighted = true
            let myColor = UIColor.init(red: 1, green: 0.7, blue: 0.8, alpha: 0.9)
            self.questionLabel.highlightedTextColor = myColor
            
            let myNewColor = UIColor.init(red: 0.7, green: 0.7, blue: 0.7, alpha: 0.9)
            self.answerLabel.highlighted = true
            self.answerLabel.highlightedTextColor = myNewColor
        }
        UIView.animateWithDuration(0.5, animations: animationClosure)
    }
    
    override func viewWillAppear(animated: Bool) {
        super.viewWillAppear(animated)
        
        // Set the label's initial alpha
        questionLabel.alpha = 0
        answerLabel.alpha = 0
        
    }
    
}