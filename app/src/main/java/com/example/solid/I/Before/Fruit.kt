package com.example.solid.I.Before

abstract class Fruit {
    abstract fun round()
    abstract fun tropical()

}

class Orange: Fruit(){
    override fun round() {
        //todo
    }

    override fun tropical() {
        //todo
    }
}

class Banana: Fruit(){
    override fun round() {
        //not applicable
    }

    override fun tropical() {
        //todo
    }
}