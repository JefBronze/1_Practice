// Creating and initializing variable
var choice = 2

// Switch statement without Fallthrough
switch(choice) {
case 1:
print("Hi! its Monday")
case 2:
print("Hi! its Tuesday") //code stops here!
case 3:
print("Hi! its Wednesday")
case 4:
print("Hi! its Thursday")
case 5:
print("Hi! its Friday")
case 6:
print("Hi! its Saturday")
case 7:
print("Hi! its Sunday")
default:
print("Choice not found")
}

// Creating and initializing variable
var choice2 = 2

// Switch statement with Fallthrough
switch(choice2) {
case 1:
print("Hi! its Monday")
case 2:
print("Hi! its Tuesday")
fallthrough
case 3:
print("Hi! its Wednesday")
case 4:
print("Hi! its Thursday")
case 5:
print("Hi! its Friday")
case 6:
print("Hi! its Saturday")
case 7:
print("Hi! its Sunday")
default:
print("Choice not found")
}
