package com.nesterov.pizza.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nesterov.pizza.databinding.ActivityNetworksBinding

class NetworksActivity : AppCompatActivity() {

    lateinit var binding: ActivityNetworksBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNetworksBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}