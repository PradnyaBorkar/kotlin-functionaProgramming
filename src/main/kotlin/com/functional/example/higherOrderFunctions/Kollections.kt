package com.functional.example.higherOrderFunctions

sealed class FnList<out T>{
    object Nil : FnList<Nothing>()
    data class Cons<T>(val head : T, val tail : FnList<T>) : FnList<T>()
}

fun main(args: Array<String>) {
   val list = FnList.Cons(1,FnList.Cons(2,FnList.Nil))
}