package com.functional.example.higherOrderFunctions

fun <T,R> transform(vararg items : T, fn : (T) -> R) : List<R> = items.map(fn)

fun main(args: Array<String>) {
    print(transform(1,2,3){i -> i.toLong()})
    print(transform("pradnya","borkar","springer"){i -> i.capitalize()})
}