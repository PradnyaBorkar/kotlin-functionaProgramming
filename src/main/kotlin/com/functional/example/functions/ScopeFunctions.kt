package com.functional.example.functions

import java.lang.StringBuilder

class ScopeFunctions{

    val sqr = fun(a :Int) {a*a}

}

fun add(a: Int, b: Int) =  a + b

fun main(args: Array<String>) {
    myHigherOrderFn(1,2) { a, b-> a+b}

    caller(1,2) { substring(1)
                         append("DEF")
                         delete(1,2)}
}

fun myHigherOrderFn(a :Int, b: Int,fn : (Int,Int) -> Int){
    fn(a,b)
}

fun caller(a: Int, b: Int,fn : StringBuilder.()-> Unit) : String {
    print(fn)
    return StringBuilder().fn().toString()
}