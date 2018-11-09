package StringTemplates_Interpolation

fun  main(args: Array<String>) {

    val name ="George"
    val str = "Hello " + name

    val str2 = "Hello $name"  //String Interpolation

    println(str)

    println("The statement after applying Interpolation: $str2. The number of characters in statement is ${str.length}")

    val a=10
    val b=5
    println("The sum of $a and $b is ${a+b}")

}

