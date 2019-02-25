package com.functional.example.higherOrderFunctions

class NumberOperations{

    fun randomize(num : Int) : Int = num * random

    companion object {
        const val random = 3
    }
}

fun main(args: Array<String>) {
    print(NumberOperations().randomize(2))
}