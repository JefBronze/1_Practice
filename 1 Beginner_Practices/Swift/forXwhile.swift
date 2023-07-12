let numbers = [1, 2, 3, 4, 5]

// for loop
for number in numbers {
    print(number)
}

// for loop with range
for i in 0..<numbers.count {
    print(numbers[i])
}

// while loop
var i = 0
while i < numbers.count {
    print(numbers[i])
    i += 1
}

// repeat-while loop
i = 0
repeat {
    print(numbers[i])
    i += 1
} while i < numbers.count

// usage of if statement within a loop
for number in numbers {
    if number % 2 == 0 {
        print("\(number) is even")
    } else {
        print("\(number) is odd")
    }
}
