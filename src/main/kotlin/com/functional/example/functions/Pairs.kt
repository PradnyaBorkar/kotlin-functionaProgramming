package com.functional.example.functions

class Pairs{
    fun getUserIdnName() : Pair<Int,String> {
        return Pair(1,"Pradnya")
    }

    fun getUser() : Triple<Int,String,String> {
        return Triple(1,"Pradnya","Borkar")
    }
}


fun main(args: Array<String>) {
    val userIdName = Pairs().getUserIdnName()
    println("User : ${userIdName.first},${userIdName.second}")
    val user = Pairs().getUser()
    println("User : ${user.first},${user.second},${user.third}")
}
