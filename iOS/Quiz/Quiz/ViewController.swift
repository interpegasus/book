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
    }
    
    @IBAction func showAnswer(sender: AnyObject){
        let answer: String = answers[currenQuestionIndex]
        answerLabel.text = answer
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        questionLabel.text = questions[currenQuestionIndex]
    }
}