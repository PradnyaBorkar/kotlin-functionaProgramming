package com.functional.example.higherOrderFunctions

class StringOperations{

    fun <T> transform(str : T, fn : (T)-> T) : T {
        return fn(str)
    }
}

fun unless(condition : Boolean, fn : () -> Unit){
    if(!condition)
        fn()
}

fun reverse(str : String) : String = str.reversed()

fun main(args: Array<String>) {
    val obj = StringOperations()
    println(obj.transform("Pradnya ") { it.toLowerCase() })
    println(obj.transform("Pradnya ",::reverse))
    println(obj.transform(1) { it + 10})

    unless(false){
        val str = """this is the code that tests unless function"""
        println(str)
        println("this code will not return anything")
    }

}