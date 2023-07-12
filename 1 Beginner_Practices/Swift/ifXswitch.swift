let num = 10

// Using if statement
if num > 0 {
    print("Positive number")
}

// Using if else statement
if num > 0 {
    print("Positive number")
} else {
    print("Negative number")
}

// Using nested if statement
if num > 0 {
    print("Positive number")
    if num % 2 == 0 {
        print("Even number")
    } else {
        print("Odd number")
    }
} else {
    print("Negative number")
}

// Using switch statement

switch num {
case 1:
    print("The number is 1")
case 2:
    print("The number is 2")
case 3:
    print("The number is 3")
default: // The default case is used to handle other cases that are not matched by the case statements.
    print("The number is not 1, 2 or 3")
}

// Output: "The number is 4"

