package com.functional.example.functions

sealed class Option<out T>{

    object None : Option<Nothing>(){
        override fun toString(): String {
            return "None"
        }
    }

    data class Some<out T>(val value: T) : Option<T>()

}

fun <T,R> Option<T>.map(transform : (T) -> R) : Option<R>{
   return when(this){
        is Option.None -> Option.None
        is Option.Some -> Option.Some(transform(value))
    }
}

fun main(args: Array<String>) {

    Option.None.map {  }
    val o = Option.Some(2).map {it -> it * 3   }
    o as Option.Some
    print(o.value)
}