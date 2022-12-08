package com.example.myapplication

data class Herbiv(
    val name: String,
    val collour: String
) {

    fun printName(){
        println(name)
    }

    fun eatSmth(eat: String) {
        println("$name, ate $eat")
    }
    fun whatItEat(eat: String) {
        println("$name, ete meat")
    }

}
