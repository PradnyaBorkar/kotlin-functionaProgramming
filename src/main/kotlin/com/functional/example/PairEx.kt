package com.functional.example

fun divide12by(num : Int ) : Pair<Int,String>{

    return when(num) {
        6 -> 2 to "success"
        0 -> -1 to "fail"
        else -> {
            0 to  "failed invalid input"
        }
    }
}

