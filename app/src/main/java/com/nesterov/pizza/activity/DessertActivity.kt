package com.nesterov.pizza.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nesterov.pizza.databinding.ActivityDessertBinding

class DessertActivity : AppCompatActivity() {

    lateinit var binding: ActivityDessertBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDessertBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}