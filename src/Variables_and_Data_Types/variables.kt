package Variables_and_Data_Types

/*
   This is the main function. Entry point of the application.
 */
fun main (args: Array<String>) : Unit {
    var myfirstString = "Hello World"
    println(myfirstString)

    var myNumber=10;     //Int
    print(myNumber)

    var myDecimal=1.0    //Float

    var myString: String    //Mutable String
    myString = "Hello World"
    myString="Another String"

    val myAnotherStr = "My Constants String Value" //Immutable String
    myAnotherStr = "Hello"  //value "Hello" in myAnotherStr prevents overwriting previous value. So use of val prevents the overwrite of previous variable
}
