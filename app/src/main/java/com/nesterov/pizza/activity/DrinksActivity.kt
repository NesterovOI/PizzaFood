package com.nesterov.pizza.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nesterov.pizza.R
import com.nesterov.pizza.adapter.AdapterCategoriesList
import com.nesterov.pizza.bd.ArrayListFood
import com.nesterov.pizza.bd.ManagementFood
import com.nesterov.pizza.data.Food
import com.nesterov.pizza.databinding.ActivityDrinksBinding

class DrinksActivity : AppCompatActivity() {

    lateinit var binding: ActivityDrinksBinding
    lateinit var itemList: ArrayList<Food>
    lateinit var findItemList: ArrayList<Food>
    lateinit var itemAdapter: AdapterCategoriesList

    val arrayListFood = ArrayListFood()
    val managementFood = ManagementFood()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDrinksBinding.inflate(layoutInflater)
        setContentView(binding.root)

        drinksRecyclerView()

        binding.homeBtn.setOnClickListener{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        }

    }
    fun drinksRecyclerView() = with(binding){
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(
            this@DrinksActivity, LinearLayoutManager.VERTICAL, false
        )
        itemList = ArrayList()
        findItemList = ArrayList()
        arrayListFood.drinksListFood(itemList)

        itemAdapter = AdapterCategoriesList(findItemList)
        recyclerView.adapter = itemAdapter

        managementFood.initFind(findItemList, idFindEdit, recyclerView, itemList)

        itemAdapter.itemClick = {
            val i = Intent(this@DrinksActivity, DrinksActivity::class.java)
            i.putExtra("Drinks", it)
            startActivity(i)
        }

        val onClick = intent.getParcelableExtra<Food>("Drinks")

        if(onClick != null){
            if (onClick.image == R.drawable.drinks1){
                managementFood.intentItemList(this@DrinksActivity, 0, itemList)
            } else if(onClick.image == R.drawable.drinks2){
                managementFood.intentItemList(this@DrinksActivity, 1, itemList)
            } else if(onClick.image == R.drawable.drinks3){
                managementFood.intentItemList(this@DrinksActivity, 2, itemList)
            } else if(onClick.image == R.drawable.drinks4){
                managementFood.intentItemList(this@DrinksActivity, 3, itemList)
            } else if(onClick.image == R.drawable.drinks5){
                managementFood.intentItemList(this@DrinksActivity, 4, itemList)
            }
        }
    }
}