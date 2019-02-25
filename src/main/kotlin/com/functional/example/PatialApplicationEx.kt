package com.functional.example

fun main(args: Array<String>) {
    val map : MutableMap<String,Int> =HashMap()
    map.put("A1",10)
    map.put("A2",11)
}

val discCalculator = {sum : Int,percentage : Int ->
    val disc = when(sum) {
        in 1..50 -> 5
        else -> 10

    }
}

//fun getTotal(map : HashMap<String,Int>, )