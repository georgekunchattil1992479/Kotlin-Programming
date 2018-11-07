package Functions_Classes_String

/*
   This is the main function. Entry point of the application.
 */
fun main (args: Array<String>) : Unit {

    var personObj=Person4()    //create obj 'personObj' to class "Person"
    personObj.name = "Steve"

    //print value from variable 'name' using Person4's object personObj
    println("The name of the person is ${personObj.name}" )

    //In order to show address of object 'personObj'
    print("The name of the person is $personObj.name" )
}

class Person4 {
    var name:String=""
}