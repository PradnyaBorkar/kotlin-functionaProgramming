package com.functional.example

fun <A,B,C> composit(f1 : (A)->(C),f2 : (B) -> (A)) : (B) -> (C) {
    return { x -> f1(f2(x))}
}

fun main(args: Array<String>) {
    val f3 = composit<String,Int,Int>({s -> s.toInt()},{i -> i.toString() })
    print(f3(1))

    val f4 = composit<String,Boolean,String>({s -> s.toUpperCase()},{i -> i.toString() })
    print(f4(true))
}