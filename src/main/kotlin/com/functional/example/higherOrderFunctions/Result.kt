package com.functional.example.higherOrderFunctions

import java.lang.Exception

sealed class Result<out T>{
    data class Success<T>(val value : T) : Result<T>()
    data class Failure(val message : String, val e :Exception) : Result<Nothing>()
}

fun main(args: Array<String>) {
val result : Result<Int> = divide(4,0)
    when(result){
        is Result.Success -> print("Success ${result.value}")
        is Result.Failure -> print("Failure ${result.message}")
    }
}

fun divide ( a : Int, b : Int ) : Result<Int>  {
   return  try{
        Result.Success( a/ b)
    }catch (e : Exception){
       Result.Failure("",e)
    }
}

