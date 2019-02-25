package com.functional.example

import kotlin.properties.Delegates

var str2 : String by Delegates.observable("one"){
    property, oldValue, newValue ->
    println("Property ${property.name} changed from $oldValue to $newValue")
}

 var even : Int by Delegates.vetoable(0){
     property, oldValue, newValue ->
     println("Property ${property.name} changed from $oldValue to $newValue")
     newValue%2 == 0
}
fun main(args: Array<String>) {
    str2 = "two"
    str2 = "three"
    even = 3
}