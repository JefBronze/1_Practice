func diviseur(number: Int) -> Bool {
    if number % 5 == 0 {
        return true
    } 
    else {
        return false
    }
}

let number = 17
let result = diviseur(number: number)
if result {
    print("\(number) est divisible par 5.")
} else {
    print("\(number) n'est pas divisible par 5.")
}
