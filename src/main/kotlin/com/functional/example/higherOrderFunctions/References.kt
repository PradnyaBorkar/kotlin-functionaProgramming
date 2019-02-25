package com.functional.example.higherOrderFunctions

import com.sun.org.apache.xpath.internal.operations.Bool


open class Parent{
   open fun print(){
       println("I am Parent")
   }
}

class Child1 : Parent(){
    override fun print(){
        println("I am Child1")
    }
}

fun toCharArr(str : String ,fn : (String) ->CharArray ) : CharArray  = fn(str)

fun isOdd(num :Int) : Boolean = num % 2 ==0

fun isOdd(str : String) : Boolean = str == "A" || str == "B"

fun main(args: Array<String>) {
    val parent = Child1()
   // print(parent is Child1)
    // print(parent as Parent)
    print(arrayOf(1,2,3).filter(::isOdd))
    print(arrayOf("A","B","C").filter(::isOdd))
    toCharArr("str", String::toCharArray)
}