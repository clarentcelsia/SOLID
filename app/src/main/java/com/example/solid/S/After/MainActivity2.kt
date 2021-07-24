package com.example.solid.S.After

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.solid.S.Data
import com.example.solid.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = Data()
        binding.tvName.text = data.name
        binding.tvBirthYear.text = data.birthYear.toString()
        binding.tvAge.text = Util.calculateAge(data.birthYear).toString()
    }
}