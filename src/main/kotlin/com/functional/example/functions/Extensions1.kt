package com.functional.example.functions

fun <A,B,C> ((A)->B).map(transfrom : (B) -> C) : (A) -> C = {
    t -> transfrom(this(t))
}

fun main(args: Array<String>)
{
    val aTOb = {a: Int -> a.toString() }
    aTOb.map{ b : String -> b.toUpperCase() }

    val sList =  listOf("a","b","c")
    print(sList.map { it -> listOf(it.toInt()) })
}