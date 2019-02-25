package com.functional.example

class Electronics private constructor(var item: String){
    init {
        print("I am init")
    }

    constructor(item: String, price : Double) : this(item){
        val price = price + 100

        print("price is $price")
     }

    constructor(item: String, price : Double,c : Int) : this(item){
        val price = price + 100

        print("price is $price")
    }
}

fun main(args: Array<String>) {
    Electronics("Fan",100.2)
}