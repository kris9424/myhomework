package com.example.myapplication

data class Carniv (
    val name: String,
   val collour: String
) {

    fun printName(){
        println(name)
    }

    fun eatSmth(eat: String) {
        println("$name, ate $eat")
    }

}