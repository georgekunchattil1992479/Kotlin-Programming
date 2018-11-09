package Ranges

fun main(args: Array<String>) {

    //Ranges

    var r1=1..5 //This ranges contains the number 1,2,3,4,5

    var r2 =5 downTo 1 //This range contains the number 5,4,3,2,1

    val r3 = 5 downTo 1 step 2 //This range contains the number 5,3,1

    var r4 = "a" .. "z" //This range contains the values from "a", "b", .., "z"

    //In order to check a in r4
    var isPresent = "a"in r4

    var countDown =10.downTo(1) //This range contains the values from 10, 9, 8, 7, 6, 5, 4, 3, 2, 1.This will show values in descending order

    var moveUp =1.rangeTo(10) //This range contains the values from 1,2,3,..,10.This will show values in ascending order



}