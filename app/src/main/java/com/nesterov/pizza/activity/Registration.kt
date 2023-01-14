package com.nesterov.pizza.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.nesterov.pizza.databinding.ActivityRegistrationBinding

class Registration : AppCompatActivity() {

    lateinit var binding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startButton.setOnClickListener{
           numberPhone()
        }

    }
    private fun numberPhone(){
        if (binding.editPhone.text.isEmpty()){
            Toast.makeText(this, "Ведіть номер телефону для регістрації", Toast.LENGTH_LONG).show()
        }else if(binding.editPhone.length() != 9){
            Toast.makeText(this, "Не вірно веддений номер телефона", Toast.LENGTH_LONG).show()
        }else{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}