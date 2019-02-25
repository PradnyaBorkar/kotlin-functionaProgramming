package com.functional.example.higherOrderFunctions

import com.functional.example.Operations

class HigherOrderFn{

    fun firstHigherOrderFn(operation : Operations) : (arg1 : Int, arg2 : Int) -> Int {

        val add = fun (a : Int, b :Int) : Int = a + b

        val subtract = fun(a : Int, b :Int) : Int = a - b

        val multiply = fun(a : Int, b :Int) : Int = a * b

        val divide = fun(a : Int, b :Int) : Int = a / b

        return when(operation){
            Operations.ADD ->  add
            Operations.SUBTRACT -> subtract
            Operations.MULTIPLY -> multiply
            Operations.DIVIDE -> divide
        }
   }

}

fun main(args: Array<String>) {
    val add = HigherOrderFn()
        .firstHigherOrderFn(Operations.ADD)
    print("Addition is ${add(1, 2)}")
}