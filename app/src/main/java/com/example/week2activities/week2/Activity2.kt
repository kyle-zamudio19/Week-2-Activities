package com.example.week2activities.week2

fun main() {
    println("  Leap Year Checker  ")
    println("")

    print("Enter Year : ")
    val year: Int = readLine()!!.toInt()
    println("")
    print(year)
    isLeapYear(year)
}

fun isLeapYear(year: Int) {
    val leapYear = " is a Leap Year"
    val notALeapYear = " is not a Leap Year"

    if (year % 4 == 0) {
        println(leapYear)
    } else if (year % 100 == 0) {
        println(leapYear)
    } else if (year % 400 == 0) {
        println(notALeapYear)
    } else println(notALeapYear)
}