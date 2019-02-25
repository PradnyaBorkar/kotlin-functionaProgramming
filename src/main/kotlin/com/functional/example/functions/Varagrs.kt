package com.functional.example.functions

fun testVarArgs(vararg str: String) : String{
    return str.fold(" ") { acc, it -> acc.plus(" " ).plus(it)}
}

fun main(args: Array<String>) {
   println( testVarArgs("Pradnya","Borkar","Springer"))
}