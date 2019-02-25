package com.functional.example

fun main(args: Array<String>) {





    val listOfList : List<List<String>>  = listOf(listOf("abc","def","fd"),listOf<String>("A","B","C"))
    val list = listOfList.flatMap { it }
    //println("List  = ${list}")

    val listOfAny : List<Any>  = listOf("abc","def","fd", arrayOf<String>("AAA","BBB","CCC"))

    //listOfAny.flatMap { print(it); it.toString().toList()  }

    var a = arrayOf(arrayOf("AAA","BBB"),arrayOf("CCC","DDD"))
    print(a.flatten())
    //listOfAny.toTypedArray().fl
    /*val list  = listOf("abc","def","fd")
    list.map { it.toUpperCase() }*/

    repeat(2) {println('a')}

}

fun getElement(){
    val listInt = listOf(1,2,null)
    for (ele in listInt)
    listInt.let {
        when(ele){
            null -> null
            else -> ele

        }

    }
}