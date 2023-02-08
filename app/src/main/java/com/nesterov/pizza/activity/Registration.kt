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

        binding.apply {

            val phone = getPhone()
           editPhone.setText(phone)

            startButton.setOnClickListener{
                numberPhone()
            }
        }

    }
    private fun numberPhone() = with(binding){
        if (editPhone.text.isEmpty()){
            Toast.makeText(this@Registration, "Ведіть номер телефону", Toast.LENGTH_LONG).show()
        }else if(editPhone.length() != 9){
            Toast.makeText(this@Registration, "Не вірно веддений номер телефона", Toast.LENGTH_LONG).show()
        }else{
            val i = Intent(this@Registration, MainActivity::class.java)
            startActivity(i)
            savePhone(editPhone.text.toString())
            finish()
        }
    }

    private fun savePhone(phone: String){
        val sharePref = getSharedPreferences("myPhone", MODE_PRIVATE)
        val editor = sharePref.edit()
        editor.putString("key_phone", phone)
        editor.commit()
    }

    fun getPhone(): String {
        val sharePref = getSharedPreferences("myPhone", MODE_PRIVATE)
        return sharePref.getString("key_phone", "")!!
    }

}