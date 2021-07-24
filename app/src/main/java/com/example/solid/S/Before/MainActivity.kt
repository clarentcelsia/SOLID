package com.example.solid.S.Before

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.solid.S.Data
import com.example.solid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = Data()
        binding.tvName.text = data.name
        binding.tvBirthYear.text = data.birthYear.toString()

        val currentYear = 2021
        val age = currentYear - data.birthYear
        binding.tvAge.text = age.toString()
    }
}