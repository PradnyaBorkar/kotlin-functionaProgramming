package com.functional.example.higherOrderFunctions

import com.sun.org.apache.xpath.internal.operations.Bool

class HOFunctions {

    val add = {a :Int, b : Int -> a + b}

    fun add1 (a :Int , b: Int)  =  a + b

    fun add2 (a :Int , b: Int) { a + b}


    fun topLevelFn(a : Int,b : Int, operation : (a : Int, b : Int) -> Int) : Int{
       return operation(a,b)
    }

    fun topLevelFn1() : (Int,Int )-> Int{
        return {a :Int, b :Int -> a+b}
    }

}

fun main(args: Array<String>) {
   val obj  = HOFunctions()
    val add = {a :Int, b : Int -> a + b}
    println(add(1,2))
    obj.topLevelFn(1,2) { a: Int, b :Int -> a+b}
    val op = obj.topLevelFn1()
    op(1,2)
    println(add(1,2))
}