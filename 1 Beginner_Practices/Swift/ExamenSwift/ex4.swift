// Prenez un tableau de nombres 
let numbers = [2, 3, 5, 10, 4]

// Créez une fonction qui renvoie le plus grand nombre
func findLargestNumber(numbers: [Int]) -> Int {
    var largestNumber = 0
    
    for number in numbers {
        if number > largestNumber {
            largestNumber = number
        }
    }
    
    return largestNumber
}

// Affichez le résultat à l'aide de l'instruction print
 let largestNumber = findLargestNumber(numbers: numbers)
 print(largestNumber) // Affiche 10
