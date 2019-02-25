package com.functional.example.higherOrderFunctions

/*interface Machine<T>{
    fun process(product :T)
}*/

typealias Machine<T> = (T) -> Unit

class PrintMachine<T> : Machine<T>{
    override fun invoke(product: T) {
         println("processing $product")
    }
}

fun<T> useProduct(t : T, machine: Machine<T>){
    machine(t)
}

fun main(args: Array<String>) {
    useProduct("Paper",PrintMachine())
}