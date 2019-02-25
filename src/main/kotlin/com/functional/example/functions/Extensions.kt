package com.functional.example.functions

import java.util.regex.Pattern


fun<K,V> Map<K,V>.plusIf(vararg pair : Pair<K,V>,condition : ()->Boolean) : Map<K,V> =
    if (condition())
        plus(pair)
    else this


fun String.countWords() : Int {
    return trim().split(Pattern.compile("\"s+")) .size
}

fun main(args: Array<String>) {
    print("this is test".countWords())

    val map : Map<Int,String> = mapOf(1 to "A",
        2 to "B",
       3 to "C")
    val latestMap = map.plusIf(Pair(4,"D")){true}
    latestMap.map { it -> println("Key ${it.key} ${it.value}") }
}