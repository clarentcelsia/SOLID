package com.example.solid.D

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.solid.R

private const val x = 10
private const val y = 5
class Calculator : AppCompatActivity() {

    private lateinit var model: CalculatorViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val repo = Repository()
        val viewModelProviderFactory = ViewModelFactory(application, repo)
        model = ViewModelProvider(this, viewModelProviderFactory).get(CalculatorViewModel::class.java)

    }

    fun addSample(){
        model.addOperation(x, y)
    }

    fun subtractSample(){
        model.subtractOperation(x, y)
    }
}