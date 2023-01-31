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
import com.nesterov.pizza.databinding.ActivityDessertBinding

class DessertActivity : AppCompatActivity() {

    lateinit var binding: ActivityDessertBinding
    lateinit var itemList: ArrayList<Food>
    lateinit var findItemList: ArrayList<Food>
    lateinit var itemAdapter: AdapterCategoriesList

    val arrayListFood = ArrayListFood()
    val managementFood = ManagementFood()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDessertBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerViewDessert()

        binding.homeBtn.setOnClickListener{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        }

    }

    fun recyclerViewDessert() = with(binding) {
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(
            this@DessertActivity, LinearLayoutManager.VERTICAL, false
        )

        itemList = ArrayList()
        findItemList = ArrayList()
        arrayListFood.dessertListFood(itemList)

        itemAdapter = AdapterCategoriesList(findItemList)
        recyclerView.adapter = itemAdapter

        managementFood.initFind(findItemList, idFindEdit, recyclerView, itemList)

        itemAdapter.itemClick = {
            val i = Intent(this@DessertActivity, DessertActivity::class.java)
            i.putExtra("Dessert", it)
            startActivity(i)
        }

        val onClick = intent.getParcelableExtra<Food>("Dessert")

        if (onClick != null) {
            if (onClick.image == R.drawable.dessert1) {
                managementFood.intentItemList(this@DessertActivity, 0, itemList)
            } else if (onClick.image == R.drawable.dessert2) {
                managementFood.intentItemList(this@DessertActivity, 1, itemList)
            } else if (onClick.image == R.drawable.dessert3) {
                managementFood.intentItemList(this@DessertActivity, 2, itemList)
            }
        }
    }
}