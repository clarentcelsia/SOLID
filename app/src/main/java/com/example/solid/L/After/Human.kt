package com.example.solid.L.After

open class Human {
    fun walk(){}
}

open class NonDisability: Human(){
    fun see(){}
}

class BlindGroup: Human()
class Normal: NonDisability() 

