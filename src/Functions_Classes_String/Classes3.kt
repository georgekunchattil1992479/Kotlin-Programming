package Functions_Classes_String

/*
   This is the main function. Entry point of the application.
 */
fun main (args: Array<String>) : Unit {

    var personObj=Person3()    //create obj 'personObj' to class "Person"
    personObj.name = "Steve"
    personObj.display()
}

class Person3 {
    var name:String=""

    fun display() {
        print(name)
    }
}