package com.nesterov.pizza.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nesterov.pizza.R
import com.nesterov.pizza.adapter.AdapterCategoriesList
import com.nesterov.pizza.bd.ArrayListFood
import com.nesterov.pizza.bd.ManagementFood
import com.nesterov.pizza.constants.Constants
import com.nesterov.pizza.data.Food
import com.nesterov.pizza.databinding.ActivityPizzaBinding

class PizzaActivity : AppCompatActivity() {

    lateinit var binding: ActivityPizzaBinding
    lateinit var itemList: ArrayList<Food>
    lateinit var itemAdapter: AdapterCategoriesList
    val arrayListFood = ArrayListFood()

    val managementFood = ManagementFood()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPizzaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerViewPizza()

    }

    fun recyclerViewPizza() = with(binding){

        recyclerViewPizza.setHasFixedSize(true)
        recyclerViewPizza.layoutManager = LinearLayoutManager(
            this@PizzaActivity, LinearLayoutManager.VERTICAL, false
        )

        itemList = ArrayList()
        arrayListFood.pizzaListFood(itemList)

        itemAdapter = AdapterCategoriesList(itemList)
        recyclerViewPizza.adapter = itemAdapter

        itemAdapter.itemClick = {
            val i = Intent(this@PizzaActivity, PizzaActivity::class.java)
            i.putExtra("Pizza", it)
            startActivity(i)
        }

        val onClick = intent.getParcelableExtra<Food>("Pizza")

        if(onClick != null){
            if(onClick.image == R.drawable.pizza1){
                managementFood.intentItemList(this@PizzaActivity, 0, itemList)
            } else if(onClick.image == R.drawable.pizza2){
                managementFood.intentItemList(this@PizzaActivity, 1, itemList)
            }else if(onClick.image == R.drawable.pizza3){
                managementFood.intentItemList(this@PizzaActivity, 2, itemList)
            }else if(onClick.image == R.drawable.pizza4){
                managementFood.intentItemList(this@PizzaActivity, 3, itemList)
            }else if(onClick.image == R.drawable.pizza5){
                managementFood.intentItemList(this@PizzaActivity, 4, itemList)
            }else if(onClick.image == R.drawable.pizza6){
                managementFood.intentItemList(this@PizzaActivity, 5, itemList)
            }else if(onClick.image == R.drawable.pizza7){
                managementFood.intentItemList(this@PizzaActivity, 6, itemList)
            }else if(onClick.image == R.drawable.pizza8){
                managementFood.intentItemList(this@PizzaActivity, 7, itemList)
            }else if(onClick.image == R.drawable.pizza9){
                managementFood.intentItemList(this@PizzaActivity, 8, itemList)
            }else if(onClick.image == R.drawable.pizza10){
                managementFood.intentItemList(this@PizzaActivity, 9, itemList)
            }else if(onClick.image == R.drawable.pizza11){
                managementFood.intentItemList(this@PizzaActivity, 10, itemList)
            }else if(onClick.image == R.drawable.pizza12){
                managementFood.intentItemList(this@PizzaActivity, 11, itemList)
            }else if(onClick.image == R.drawable.pizza13){
                managementFood.intentItemList(this@PizzaActivity, 12, itemList)
            }

        }


    }

}