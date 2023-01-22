package com.nesterov.pizza.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nesterov.pizza.databinding.ActivitySoupsBinding

class SoupsActivity : AppCompatActivity() {

    lateinit var binding: ActivitySoupsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySoupsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}