package com.example.solid.I.After

abstract class Fruit {
    abstract fun tropical()
}

abstract class Round: Fruit(){
    abstract fun diameter()
}
abstract class Long: Fruit(){
    abstract fun length()
}


class Banana: Long(){
    override fun length() {
        TODO("Not yet implemented")
    }

    override fun tropical() {
        TODO("Not yet implemented")
    }

}


class Orange: Round(){
    override fun diameter() {
        TODO("Not yet implemented")
    }

    override fun tropical() {
        TODO("Not yet implemented")
    }

}