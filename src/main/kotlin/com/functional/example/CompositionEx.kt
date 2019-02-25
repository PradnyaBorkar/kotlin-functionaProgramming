package com.functional.example

fun fun1(a :Int) : Double = a.toDouble()

val fun11 = {a : Int , b : Int -> a+b}

fun fun2 (a :Double) :  String = a.toString()


//Type 1 static
fun fun3(a: Int) : String = fun2(fun1(a))

//Type 2 dynamic
fun fun33(a : Int,fn1 : (Int) -> Double,fn2 : (Double) -> String) : String {
    return fn2(fn1(a))
}


fun test(range : IntRange , fn : (Int) -> Unit){
    for (i in range)
        fn(i)
}


fun add(init : Int = 0): (Int)-> Int{
    var acc =init
    return {i ->  acc += i; acc}
}

fun prod(init : Int = 1): (Int)-> Int{
    var acc =init
    return {i ->  acc *= i; acc}
}

fun operate(num : Int, behaviour : (Int) -> Int){
    var total = 0
    for (i in 1..num)
        total= behaviour(i)
    println(total)
}

fun main(args: Array<String>) {
  // test(1..10){i-> println(i)}

    //println(process(0,5){i,j ->i+j })
    //println( process(1,5){i,j ->i*j })
    operate(5,add())
    operate(5,prod())

    val fnProd = prod(1)
}


fun process(init : Int,num : Int, fn: (Int,Int) -> Int) : Int{
  var res : Int = init
    for(i in 1..num) {
        res = fn(res, i)
    }
    return res
  }
