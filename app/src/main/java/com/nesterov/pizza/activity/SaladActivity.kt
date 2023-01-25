package com.nesterov.pizza.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.nesterov.pizza.R
import com.nesterov.pizza.adapter.AdapterCategoriesList
import com.nesterov.pizza.bd.ArrayListFood
import com.nesterov.pizza.bd.ManagementFood
import com.nesterov.pizza.data.Food
import com.nesterov.pizza.databinding.ActivitySaladBinding

class SaladActivity : AppCompatActivity() {

    lateinit var binding: ActivitySaladBinding
    lateinit var itemList: ArrayList<Food>
    lateinit var itemAdapter: AdapterCategoriesList

    val arrayListFood = ArrayListFood()
    val managementFood = ManagementFood()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySaladBinding.inflate(layoutInflater)
        setContentView(binding.root)

        saladRecyclerView()

    }
    fun saladRecyclerView() = with(binding) {

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(
            this@SaladActivity, LinearLayoutManager.VERTICAL, false
        )

        itemList = ArrayList()
        arrayListFood.rolesListFood(itemList)

        itemAdapter.itemClick = {
            val i = Intent(this@SaladActivity, SaladActivity::class.java)
            i.putExtra("Salad", it)
            startActivity(i)
        }

        val onClick = intent.getParcelableExtra<Food>("Salad")

        if(onClick != null){
            if (onClick.image == R.drawable.salad1) {
                managementFood.intentItemList(this@SaladActivity, 0, itemList)
            } else if (onClick.image == R.drawable.salad2) {
                managementFood.intentItemList(this@SaladActivity, 1, itemList)
            } else if (onClick.image == R.drawable.salad3) {
                managementFood.intentItemList(this@SaladActivity, 2, itemList)
            } else if (onClick.image == R.drawable.salad4) {
                managementFood.intentItemList(this@SaladActivity, 3, itemList)
            }  else if (onClick.image == R.drawable.salad5) {
                managementFood.intentItemList(this@SaladActivity, 4, itemList)
            } else if (onClick.image == R.drawable.salad6) {
                managementFood.intentItemList(this@SaladActivity, 5, itemList)
            } else if (onClick.image == R.drawable.salad7) {
                managementFood.intentItemList(this@SaladActivity, 6, itemList)
            } else if (onClick.image == R.drawable.salad8) {
                managementFood.intentItemList(this@SaladActivity, 7, itemList)
            } else if (onClick.image == R.drawable.salad9) {
                managementFood.intentItemList(this@SaladActivity, 8, itemList)
            } else if (onClick.image == R.drawable.salad10) {
                managementFood.intentItemList(this@SaladActivity, 9, itemList)
            } else if (onClick.image == R.drawable.salad11) {
                managementFood.intentItemList(this@SaladActivity, 10, itemList)
            } else if (onClick.image == R.drawable.salad12) {
                managementFood.intentItemList(this@SaladActivity, 11, itemList)
            } else if (onClick.image == R.drawable.salad13) {
                managementFood.intentItemList(this@SaladActivity, 12, itemList)
            } else if (onClick.image == R.drawable.salad14) {
                managementFood.intentItemList(this@SaladActivity, 13, itemList)
            } else if (onClick.image == R.drawable.salad15) {
                managementFood.intentItemList(this@SaladActivity, 14, itemList)
            } else if (onClick.image == R.drawable.salad16) {
                managementFood.intentItemList(this@SaladActivity, 15, itemList)
            }
        }

    }
}