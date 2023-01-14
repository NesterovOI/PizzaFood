package com.nesterov.pizza.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.view.isEmpty
import androidx.recyclerview.widget.LinearLayoutManager
import com.nesterov.pizza.adapter.AdapterCartList
import com.nesterov.pizza.adapter.AdapterPopularFood
import com.nesterov.pizza.constants.Constants
import com.nesterov.pizza.data.Food
import com.nesterov.pizza.data.FoodCart
import com.nesterov.pizza.databinding.ActivityCartListBinding


class CartListActivity : AppCompatActivity() {

    lateinit var binding: ActivityCartListBinding
    val adapterFood = AdapterCartList()
    lateinit var itemList: ArrayList<FoodCart>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCartListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //   empty()

        binding.apply {
            cartRecyclerView.setHasFixedSize(true)
            cartRecyclerView.layoutManager = LinearLayoutManager(
                this@CartListActivity, LinearLayoutManager.VERTICAL, false
            )

            itemList = ArrayList()

            var intent = intent
            val image: Int = intent.getIntExtra(Constants.IMAGE_FOOD, 0)
            val title = intent.getStringExtra(Constants.TITLE_FOOD)
            val number = intent.getStringExtra(Constants.NUMBER_FOOD)
            val money = intent.getStringExtra(Constants.MONEY_FOOD)
            val totalMoney = intent.getStringExtra(Constants.TOTAL_MONEY)

            val numberAdd : Int = number.toString().toInt()
            val moneyAdd : Double = money.toString().toDouble()
            val totalMoneyAdd : Double = totalMoney.toString().toDouble()

            allFoodTxt.text = money
            totalManyTxt.text = totalMoney

            val food = FoodCart(image, title, numberAdd, moneyAdd, totalMoneyAdd)

            adapterFood.addFoodDomain(food)
            cartRecyclerView.adapter = adapterFood

            adapterFood.itemClick = {
                val i = Intent(this@CartListActivity, CartListActivity::class.java)
                i.putExtra("item", it)
                startActivity(i)
            }

            deliveryCheckBox.setOnClickListener {
                checkBox()
            }
            homeBtn.setOnClickListener {
                val i = Intent(this@CartListActivity, MainActivity::class.java)
                startActivity(i)
                finish()
            }
        }

    }

    fun checkBox() = with(binding) {
        if (deliveryCheckBox.isChecked) {
            taxi.visibility = View.VISIBLE
        } else {
            taxi.visibility = View.GONE
        }
    }

    fun empty() = with(binding) {
        if (cartRecyclerView.isEmpty()) {
            scrollView.visibility = View.GONE
            emptyTxt.visibility = View.VISIBLE
        } else {
            scrollView.visibility = View.VISIBLE
            emptyTxt.visibility = View.GONE
        }
    }
}