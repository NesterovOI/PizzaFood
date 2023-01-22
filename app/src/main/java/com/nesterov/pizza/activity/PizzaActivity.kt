package com.nesterov.pizza.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nesterov.pizza.databinding.ActivityPizzaBinding

class PizzaActivity : AppCompatActivity() {

    lateinit var binding: ActivityPizzaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPizzaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}