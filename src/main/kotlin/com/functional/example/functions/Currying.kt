package com.functional.example.functions

fun fun1(a : Int, b : Int, c : Int, d : String) : String {
    val e = a + b
    val f  = e * c
    return d+f
}

fun fun2(a : Int)= {b : Int -> {c : Int -> {d: String ->val e = a + b ;val f  = e * c ; d+f}}}
val fun3 = {a : Int, b: Int -> a+b}

val curried = {a : Int, b : Int -> a+b}

fun main(args: Array<String>) {
    print(fun2(1)(2)(3)("Ans"))
    val s = fun2(1)
    print(s(2)(3)(""))
    print(s(3)(4)("SS"))
   // fun3(1)
}