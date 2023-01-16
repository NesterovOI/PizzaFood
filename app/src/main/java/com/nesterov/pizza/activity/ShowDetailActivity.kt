package com.nesterov.pizza.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nesterov.pizza.constants.Constants
import com.nesterov.pizza.data.Food
import com.nesterov.pizza.databinding.ActivityShowDetailBinding

class ShowDetailActivity : AppCompatActivity() {

    lateinit var binding: ActivityShowDetailBinding
    var numberProduct = 1
    private var sum = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val food = intent.getParcelableExtra<Food>(Constants.ITEM_LIST_POPULAR_FOOD)

        binding.apply {
            if (food != null) {
                titleTxt.setText(food.title)
                priceTxt.text = food.money.toString()
                imageFood.setImageResource(food.image)
                descriptionTxt.setText(food.description)
                totalMoney.text = food.money.toString()
            }
            plusBtn.setOnClickListener {
                plusProduct()
            }
            minusBtn.setOnClickListener {
                minusProduct()
            }
            addToCartBtn.setOnClickListener {
                cleave()
            }
        }

    }

    private fun plusProduct() = with(binding) {
        numberProduct++
        val money = priceTxt.text.toString().toDouble()
        sum = numberProduct * money
        totalMoney.text = sum.toString()
        numberOrderTxt.text = numberProduct.toString()
    }

    private fun minusProduct() = with(binding) {
        if (numberProduct > 1) {
            numberProduct--
            numberOrderTxt.text = numberProduct.toString()
            val money = priceTxt.text.toString().toDouble()
            sum = money / numberProduct
            totalMoney.text = sum.toString()
        }
    }

    fun cleave() = with(binding) {
        addToCartBtn.setOnClickListener {

            val image = imageFood.id
            val title: String = titleTxt.text.toString()
            val number: String = numberOrderTxt.text.toString()
            val money: String = priceTxt.text.toString()
            val totalMoney: String = totalMoney.text.toString()

            val i = Intent(this@ShowDetailActivity, CartListActivity::class.java)
            i.putExtra(Constants.IMAGE_FOOD, image)
            i.putExtra(Constants.TITLE_FOOD, title)
            i.putExtra(Constants.NUMBER_FOOD, number)
            i.putExtra(Constants.MONEY_FOOD, money)
            i.putExtra(Constants.TOTAL_MONEY, totalMoney)
            startActivity(i)
            finish()
        }
    }

}