package com.functional.example

import kotlin.properties.Delegates

var str : String by Delegates.notNull()
lateinit var str1 :String

fun main(args: Array<String>) {
    str = "hello"
    str1 = "hello"
    print(str)
    print(str1)
}

