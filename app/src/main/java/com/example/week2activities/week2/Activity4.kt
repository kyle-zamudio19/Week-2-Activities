package com.example.week2activities.week2

fun main() {

    //Printing the names of the students in a class

    val names = arrayOf("kyle", "emilio", "karl", "rodney", "ronnel", "rene", "mario")
    for (name in names) {
        println("$name is a Kodego Student!")
    }

    //finding the first number divisible by both 3 and 5

    var number = 1
    do {
        number++
        println(number)
        if (number % 3 == 0 && number % 5 == 0) {
            println("\n$number is divisible by both 3 and 5")
            break
        }
    } while (true)
}