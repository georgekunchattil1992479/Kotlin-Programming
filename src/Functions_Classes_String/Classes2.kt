package Functions_Classes_String

/*
   This is the main function. Entry point of the application.
 */
fun main (args: Array<String>) : Unit {

    var personObj=Person2()    //create obj 'personObj' to class "Person"
    personObj.name = "Steve"
    personObj.display(personObj.name)
}

class Person2 {
    var name:String=""

    fun display(name: String) {
        print(name)
    }
}