package com.functional.example.collection

import com.sun.org.apache.xpath.internal.operations.Bool


data class Customer(val name: String )

data class Address(val line1 : String)


fun fun1(a : Int) = {
    val b= a* 10
    val c = b /2
}

fun add10 (a : Int)= a +10
fun divBy2(a: Int) = a/2

fun main(args: Array<String>) {
    val map = mapOf(Pair(Customer("Pradnya"),Address("Pune")),
                                          Pair(Customer("Ganesh"),Address("Anagar")))
    //print(map.flatMap { (customer,address) -> listOf(address) })
    //print(map.flatMapTo(mutableListOf(Address(""))) { (customer,address) -> listOf(address) })
    fun1(10)
    divBy2(add10(10))

}

data class Product(val bought : Boolean,val price : Double)

val productsList = listOf(Product(true,123.3),Product(true,124.3),Product(true,125.3))

fun twoStepListProcessing(): List<Double> {
    return productsList
        .filter { it.bought }
        .map { it.price }
}

fun twoStepSequenceProcessing(): List<Double> {
    return productsList.asSequence()
        .filter { it.bought }
        .map { it.price }
        .toList()
}

fun threeStepListProcessing(): Double {
    return productsList
        .filter { it.bought }
        .map { it.price }
        .average()
}

fun threeStepSequenceProcessing(): Double {
    return productsList.asSequence()
        .filter { it.bought }
        .map { it.price }
        .average()
}

val lambda : ()->Unit = {

}
