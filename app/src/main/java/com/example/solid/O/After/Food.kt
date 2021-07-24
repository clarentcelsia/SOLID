package com.example.solid.O.After

interface Food {
    fun getTotal(): Int
}


class Dessert: Food {
    val price = 30
    val tax = 10
    override fun getTotal(): Int {
        return price + tax
    }

}

class MainDish: Food{
    val price = 50
    val tax = 5
    override fun getTotal(): Int {
        return price + tax
    }

}

class Appetizer: Food{
    val price = 20
    val tax = 2
    override fun getTotal(): Int {
        return price + tax
    }

}

class Order {
    var total = 0
    fun calculate(foodList: List<Food>){
        foodList.forEach { food ->
            total += food.getTotal()
        }
    }
}

fun main(){
    val order = Order()
    order.calculate(listOf(Dessert(), MainDish(), Appetizer()))
}
