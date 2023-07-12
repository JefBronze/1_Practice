// Arrays:
let array = [1, 2, 3, 4, 5] //An array is an ordered collection of values, accessed by index. Arrays are mutable, meaning their values can be changed after they are created.
print("Array: \(array)")
print(array[1])

// Sets:
let set: Set = [1, 2, 3, 4, 5] //A set is an unordered collection of unique values, accessed by value. Sets are also mutable and the values can be changed after they are created.
print("Set: \(set)")

//A tuple is a fixed-size collection of values, accessed by index. Tuples are immutable and their values cannot be changed after they are created.
// 1 Named Tuple:
let nameAndAge = (name:"Midhun", age:7) 
print(nameAndAge.name)
print(nameAndAge.age)
print(nameAndAge)

//2 Unnamed Tuple:
let nameAndAge1 = ("Midhun", 7) 
print(nameAndAge1.0)
print(nameAndAge1.1)
print(nameAndAge1)

// So, the main differences between arrays, sets, and tuples in Swift are: order, mutability, and size. Arrays are ordered, mutable, and have a variable size. Sets are unordered, mutable, and have a variable size. Tuples are ordered, immutable, and have a fixed size.


// Dictionary example:
// Dictionary with keys and values of different data types
var capitalCity = ["Nepal": "Kathmandu", "England": "London"]
print("Initial Dictionary: ",capitalCity)

capitalCity["Japan"] = "Tokyo"

print("Initial Dictionary: ",capitalCity)
print(capitalCity["Japan"])

var studentID = [111: "Eric", 112: "Kyle", 113: "Butters"]
print("Initial Dictionary: ", studentID)

studentID[112] = "Stan"

print("Updated Dictionary: ", studentID)
print(studentID[111])

var iceCream = [
    "Ben&Jerry": 1,
    "Yopa": 2,
    "Kibon": 3
]
print(iceCream)
print(iceCream["Yopa"])

iceCream["Outro"] = 0
print(iceCream)
print(iceCream["Outro"])

var iceCream2 = [
    "Ben & Jerry": 1,
    "Yopa": 2,
    "Kibon": 3
]

let flavor = "Haagen-Dazs"
let price = iceCream2[flavor, default: 0]
print("The price of \(flavor) is \(price)")
