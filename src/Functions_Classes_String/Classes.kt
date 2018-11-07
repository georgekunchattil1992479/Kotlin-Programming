package Functions_Classes_String

/*
   This is the main function. Entry point of the application.
 */
fun main (args: Array<String>) : Unit {

    var name:String
    name = "Steve"

    var personObj=Person()    //create obj 'personObj' to class "Person"
    personObj.display(name)  //call display() method using object 'personObj'
}

class Person {
    fun display(name: String) {
        print(name)
    }
}