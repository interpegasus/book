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


// Dictionaries


var nameAge: Dictionary<Int, String>

let myDict = [12:"Ana",13:"Mara"]

nameAge = myDict

if let nameAgeConst = nameAge[13] {
    print("OK")
}


// Loops

let myNumberArray = [Int]()
let emptyString = String()
var optionalFloat:Float?
var optionalString:String?


var range = 0..<9
for i in range {
    print(i)
}


class Record: Hashable {
    var uid: Int
    var name: String
    var hashValue: Int {
        return self.uid
    }
    
    init(uid: Int, name: String) {
        self.uid = uid
        self.name = name
    }
}

func ==(lhs: Record, rhs: Record) -> Bool {
    return lhs.uid == rhs.uid
}

var records = Set<Record>()
var letters = Set<Character>()


// Enum

enum CarType {
    case Ferrari
    case Lamborghini
    case Mercedez
    case Audi
}

let myAudi = CarType.Audi

let name: String
switch myAudi {
    case .Ferrari:
        name = "my Ferrari"
    case .Audi:
        name = "my Audi"
    default:
        name = "my A4"
}












