package StringTemplates_Interpolation

fun  main(args: Array<String>) {

    var rect=Rectangle()
    rect.length=5
    rect.breadth=3

    println("The length of rectangle is ${rect.length} and breadth is ${rect.breadth}. The area is ${rect.length*rect.breadth}")
}

class Rectangle {
    var length: Int =0
    var breadth: Int =0
}