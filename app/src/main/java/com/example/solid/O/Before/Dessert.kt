package com.example.solid.O.Before

class Dessert {
    val price = 30
    val tax = 10

    fun getTotal(): Int{
        return price + tax
    }
}

class MainDish{
    val price = 50
    val tax = 5

    fun getTotal(): Int{
        return price + tax
    }
}

class Order {
    val dessert = Dessert()
    val mainDish = MainDish()
    /*
        ....
     */

    fun calculate(){
        dessert.getTotal() + mainDish.getTotal()
    }
}

fun main(){
    val order = Order()
    order.calculate()
}

