package com.nesterov.pizza.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nesterov.pizza.databinding.ActivityRolesBinding

class RolesActivity : AppCompatActivity() {

    lateinit var binding: ActivityRolesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRolesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}