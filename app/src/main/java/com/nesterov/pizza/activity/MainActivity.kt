package com.nesterov.pizza.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nesterov.pizza.R
import com.nesterov.pizza.adapter.AdapterCategories
import com.nesterov.pizza.adapter.AdapterPopularFood
import com.nesterov.pizza.bd.ArrayListFood
import com.nesterov.pizza.bd.ManagementFood
import com.nesterov.pizza.data.Categories
import com.nesterov.pizza.data.Food
import com.nesterov.pizza.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    lateinit var binding: ActivityMainBinding

    lateinit var itemList: ArrayList<Categories>
    lateinit var itemAdapter: AdapterCategories

    lateinit var itemListFood: ArrayList<Food>
    lateinit var itemAdapterPopularFood: AdapterPopularFood

    val arrayListFood = ArrayListFood()
    val managementFood = ManagementFood()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerViewCategoties()
        recyclerViewPopulars()

        binding.cartBtn.setOnClickListener{
            val i = Intent(this, CartListActivity::class.java)
            startActivity(i)
            finish()
        }

    }

    fun recyclerViewCategoties() = with(binding) {
        idRecyclerViewCategories.setHasFixedSize(true)
        idRecyclerViewCategories.layoutManager = LinearLayoutManager(
            this@MainActivity,
            LinearLayoutManager.HORIZONTAL, false
        )
        itemList = ArrayList()

        arrayListFood.categoriesListFood(itemList)

        itemAdapter = AdapterCategories(itemList)
        idRecyclerViewCategories.adapter = itemAdapter

        itemAdapter.itemClick = {
            val i = Intent(this@MainActivity, MainActivity::class.java)
            i.putExtra("open", it)
            startActivity(i)
        }

        val itemOnClick = intent.getParcelableExtra<Categories>("open")

        if (itemOnClick != null) {
            if (itemOnClick.image == R.drawable.cat_1){
                val i = Intent(this@MainActivity, PizzaActivity::class.java)
                startActivity(i)
                finish()
            }else if(itemOnClick.image == R.drawable.cat_2){
                val i = Intent(this@MainActivity, RolesActivity::class.java)
                startActivity(i)
                finish()
            }else if(itemOnClick.image == R.drawable.cat_3){
                val i = Intent(this@MainActivity, NetworksActivity::class.java)
                startActivity(i)
                finish()
            }else if(itemOnClick.image == R.drawable.cat_4){
                val i = Intent(this@MainActivity, SaladActivity::class.java)
                startActivity(i)
                finish()
            }else if(itemOnClick.image == R.drawable.cat_5){
                val i = Intent(this@MainActivity, SoupsActivity::class.java)
                startActivity(i)
                finish()
            }else if(itemOnClick.image == R.drawable.cat_6){
                val i = Intent(this@MainActivity, AdditionActivity::class.java)
                startActivity(i)
                finish()
            }else if(itemOnClick.image == R.drawable.cat_7){
                val i = Intent(this@MainActivity, DessertActivity::class.java)
                startActivity(i)
                finish()
            }else if(itemOnClick.image == R.drawable.cat_8){
                val i = Intent(this@MainActivity, DrinksActivity::class.java)
                startActivity(i)
                finish()
            }
        }

    }

    fun recyclerViewPopulars() = with(binding) {
        idRecyclerViewPopular.setHasFixedSize(true)
        idRecyclerViewPopular.layoutManager = LinearLayoutManager(
            this@MainActivity,
            LinearLayoutManager.HORIZONTAL, false
        )
        itemListFood = ArrayList()

        arrayListFood.popularListFood(itemListFood)

        itemAdapterPopularFood = AdapterPopularFood(itemListFood)
        idRecyclerViewPopular.adapter = itemAdapterPopularFood

        itemAdapterPopularFood.itemClick = {
            val i = Intent(this@MainActivity, MainActivity::class.java)
            i.putExtra("item", it)
            startActivity(i)
        }

        val itemOnClick = intent.getParcelableExtra<Food>("item")
        if (itemOnClick != null){

            if (itemOnClick.image == R.drawable.pop_1){
                managementFood.intentItemList(this@MainActivity,0, itemListFood)
            } else
            if (itemOnClick.image == R.drawable.cat_2){
                managementFood.intentItemList(this@MainActivity,1, itemListFood)
            } else
            if (itemOnClick.image == R.drawable.pop_3){
                managementFood.intentItemList(this@MainActivity,2, itemListFood)
            } else
            if (itemOnClick.image == R.drawable.cat_4){
                managementFood.intentItemList(this@MainActivity,3, itemListFood)
            }
        }
    }
}