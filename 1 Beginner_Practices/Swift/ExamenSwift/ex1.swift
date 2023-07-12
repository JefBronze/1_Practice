func getTriangleSurface(base: Double, height: Double) -> Double {
    let surface = (base * height) / 2
    return surface
}

// Call the function
let triangleSurface = getTriangleSurface(base: 10, height: 20) 

// Print the result 
print("The surface of the triangle is \(triangleSurface)")
