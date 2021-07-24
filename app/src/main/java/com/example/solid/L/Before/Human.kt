package com.example.solid.L.Before

open class Human {
    fun see(){}
    fun walk(){}
}

//see() function cannot be used
class Blind: Human()

