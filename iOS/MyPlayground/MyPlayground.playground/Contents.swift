//: Playground - noun: a place where people can play

import UIKit

var str = "Hello, playground"

str = "Love"

let contStr = "GIRONA"

let newConstant = str

var year: Int = 8

var newStringArray: Array<String>

var newArrayIntegers: [Int]

var newDictionary: Dictionary<String, String>

var newDictionaryAnimals: [Int:String]

var myGirlfriendsNames: Set<String>



var countdown = [1,2,3]

var strCountdown = ["one","two"]


// Properties & Methods

countdown.count
countdown.isEmpty
strCountdown.append("Four")
countdown.append(4)


let constArrayCd = strCountdown

var anOptionalInteger: Int?






// Optionals

var myReading1:Float?
var myReading2:Float?
var myReading3:Float?


myReading1 = 1
myReading2 = 2
myReading3 = 3


if let r1 = myReading1,r2=myReading2,r3=myReading3{
    let myAverageReading = ( r1 + r2 + r3 )/3
} else {
    let errorStr = "Error nil "
}

// Dictionaries


var nameAge: Dictionary<Int, String>

let myDict = [12:"Ana",13:"Mara"]

nameAge = myDict

if let nameAgeConst = nameAge[13] {
    print("OK")
}


// Loops

var coubnter = 5
var i = 0
for (i = 0 ; i <  coubnter; i += 1){
    let newStr = i
}














