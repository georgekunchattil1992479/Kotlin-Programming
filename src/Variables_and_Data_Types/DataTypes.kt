package Variables_and_Data_Types

/*
   This is the main function. Entry point of the application.
 */
fun main (args: Array<String>) : Unit {
    var myfirstString = "Hello World" //var myfirstString:String="Hello World"
    println(myfirstString)

    var name: String
    name = "George"

    var age: Int=10
    var myAge=10

    var isAlive: Boolean = true;
    var marks: Float =97.4f // or var marks: Float =97.4F
    var perc:Double = 90.78
    var gender:  Char = 'M'

    println(name)
    println(age)
    println(myAge)
    println(isAlive)
    println(marks)
    println(perc)
    println(gender)

}