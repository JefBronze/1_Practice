func returnNameAndAgeOfEldest(nameAgeDict: [String: Int]) -> (String, Int) {
    var eldestName = ""
    var eldestAge = 0
    
    for (name, age) in nameAgeDict{
        if age > eldestAge {
            eldestAge = age
            eldestName = name
        }
    }
    
    print("The eldest person is \(eldestName)") 
    return (eldestName, eldestAge)
}

var nameAgeDict = ["John": 22, "Katie": 98, "Alicia": 16, "Andy": 26, "Sophie": 25] 

let eldestPerson = returnNameAndAgeOfEldest(nameAgeDict: nameAgeDict)

print("The eldest person is \(eldestName), who is \(eldestAge) years old")
