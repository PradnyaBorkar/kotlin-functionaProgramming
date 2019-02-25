package com.functional.example

class Box<in T>(t : T){
    //var value = t

    fun test(){
        //t.
    }

}

fun main(args: Array<String>) {
    val b : Box<Number> = Box(1)
}