package com.example.week2activities.week2

//fun main() {
//    var continueGrading = true
//    while (continueGrading) {
//        println("  Grade Calculator  ")
//        println("")
//        print("What is your score? : ")
//        val score = readLine()!!.toDouble()
//        println(calculateGrade(score))
//
//        println("")
//        println("Do you want to Continue Grading? \n Type Yes or No")
//        val response = readLine()
//        if (response != "Yes")
//            if (response != "yes")
//                if (response != "YES")
//                    continueGrading = false
//    }
//}
//
//fun calculateGrade(score: Double): String {
//    val averageA: ClosedFloatingPointRange<Double> = 90.0..100.0
//    val averageB: ClosedFloatingPointRange<Double> = 80.0..89.0
//    val averageC: ClosedFloatingPointRange<Double> = 70.0..79.0
//    val averageD: ClosedFloatingPointRange<Double> = 60.0..69.0
//    val averageE: ClosedFloatingPointRange<Double> = 0.0..59.0
//
//    println("")
//    return when (score) {
//        in averageA -> {
//            "Your Average is A"
//        }
//        in averageB -> {
//            "Your Average is B"
//        }
//        in averageC -> {
//            "Your Average is C"
//        }
//        in averageD -> {
//            "Your Average is D"
//        }
//        in averageE -> {
//            "Your Average is F"
//        }
//        else -> {
//            "Invalid Entry"
//        }
//    }
//}

fun isLeapYear(year: Int) {
    val leapYear = " is a Leap Year"
    val notALeapYear = " is not a Leap Year"


    if (year % 4 == 0 || year % 100 == 0) {
        println(leapYear)
    } else if (year % 400 == 0) {
        println(notALeapYear)
    } else println(notALeapYear)
}

fun main() {
    var continueChecking = true
    while (continueChecking) {
        println("  Leap Year Checker  ")
        println("")

        print("Enter Year : ")
        val year: Int = readLine()!!.toInt()
        println("")
        print(year)
        isLeapYear(year)
        println("")
        println("Do you want to check another Year? \n Type Yes or No")
        val response = readLine()
        if (response != "Yes")
            if (response != "yes")
                if (response != "YES")
                    continueChecking = false
    }
}