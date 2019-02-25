package com.functional.example.functions

open class Animal

fun Animal.mekeNoise() = "generic noise"

fun Animal.eat() = "eat generic food"

class Cat : Animal()

fun Cat.makeNoise() = "Mew"


fun makeNoise(animal: Animal) : String = animal.mekeNoise()

fun main(args: Array<String>) {
    println(makeNoise(Animal()))
    println(makeNoise(Cat()))
    println( Cat().makeNoise())
}