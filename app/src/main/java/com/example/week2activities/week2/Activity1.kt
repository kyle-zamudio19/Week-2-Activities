package com.example.week2activities.week2

fun main() {

    println("  Grade Calculator  ")
    println("")
    print("What is your score? : ")

    val num: Double = readLine()!!.toDouble()
    calculateGrade(num)
}

fun calculateGrade(score: Double) {
    val averageA: ClosedFloatingPointRange<Double> = 90.0..100.0
    val averageB: ClosedFloatingPointRange<Double> = 80.0..89.0
    val averageC: ClosedFloatingPointRange<Double> = 70.0..79.0
    val averageD: ClosedFloatingPointRange<Double> = 60.0..69.0
    val averageE: ClosedFloatingPointRange<Double> = 0.0..59.0

    println("")
    if (score in averageA) {
        println("Your Average is A")
    } else if (score in averageB) {
        println("Your Average is B")
    } else if (score in averageC) {
        println("Your Average is C")
    } else if (score in averageD) {
        println("Your Average is D")
    } else if (score in averageE) {
        println("Your Average is F")
    } else {
        println("Invalid Entry")
    }
}