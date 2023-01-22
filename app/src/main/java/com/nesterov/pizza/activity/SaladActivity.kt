package com.nesterov.pizza.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nesterov.pizza.databinding.ActivitySaladBinding

class SaladActivity : AppCompatActivity() {

    lateinit var binding: ActivitySaladBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySaladBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}