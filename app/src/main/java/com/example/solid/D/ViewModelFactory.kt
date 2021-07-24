package com.example.solid.D

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory(
    val app: Application,
    private val repository: Repository
    ): ViewModelProvider.Factory
{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(CalculatorViewModel::class.java)){
            return CalculatorViewModel(app, repository) as T
        }
        throw IllegalArgumentException("unknown viewmodel class")
    }

}