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
import com.nesterov.pizza.databinding.ActivitySoupsBinding

class SoupsActivity : AppCompatActivity() {

    lateinit var binding: ActivitySoupsBinding
    lateinit var itemList: ArrayList<Food>
    lateinit var itemAdapter: AdapterCategoriesList

    val arrayListFood = ArrayListFood()
    val managementFood = ManagementFood()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySoupsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        soupsRecyclerView()

    }
    fun soupsRecyclerView() = with(binding){

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(
            this@SoupsActivity, LinearLayoutManager.VERTICAL, false
        )

        itemList = ArrayList()
        arrayListFood.soupsListFood(itemList)

        itemAdapter = AdapterCategoriesList(itemList)
        recyclerView.adapter = itemAdapter

        itemAdapter.itemClick = {
            val i = Intent(this@SoupsActivity, SoupsActivity::class.java)
            i.putExtra("Soups", it)
            startActivity(i)
        }

        val onClick = intent.getParcelableExtra<Food>("Soups")

        if (onClick != null){
            if (onClick.image == R.drawable.soups1){
                managementFood.intentItemList(this@SoupsActivity, 0, itemList)
            } else if (onClick.image == R.drawable.soups2){
                managementFood.intentItemList(this@SoupsActivity, 1, itemList)
            } else if (onClick.image == R.drawable.soups3){
                managementFood.intentItemList(this@SoupsActivity, 2, itemList)
            } else if (onClick.image == R.drawable.soups4){
                managementFood.intentItemList(this@SoupsActivity, 3, itemList)
            } else if (onClick.image == R.drawable.soups5){
                managementFood.intentItemList(this@SoupsActivity, 4, itemList)
            } else if (onClick.image == R.drawable.soups6){
                managementFood.intentItemList(this@SoupsActivity, 5, itemList)
            } else if (onClick.image == R.drawable.soups7){
                managementFood.intentItemList(this@SoupsActivity, 6, itemList)
            }
        }
    }
}