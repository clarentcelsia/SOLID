package com.example.solid.D

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class CalculatorViewModel(
    val app: Application,
    private val repository: Repository
    ): AndroidViewModel(app)
{
    fun addOperation(x: Int, y: Int){
        repository.adding(x, y)
    }

    fun subtractOperation(x: Int, y: Int){
        repository.subtracting(x, y)
    }

}