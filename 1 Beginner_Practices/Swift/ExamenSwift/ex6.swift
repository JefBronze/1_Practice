func findStringIndex(in array: [String], for string: String) -> Int? {
    for (index, value) in array.enumerated() { 
        if value == string {
            return index
        }
    }
    return nil
}

let myArray = ["cat", "dog", "elephant", "Jeferson"]
let index = findStringIndex(in: myArray, for: "Jeferson")
print(index ?? -1) // 1
