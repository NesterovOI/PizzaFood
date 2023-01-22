package com.nesterov.pizza.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nesterov.pizza.R
import com.nesterov.pizza.adapter.AdapterCategories
import com.nesterov.pizza.adapter.AdapterPopularFood
import com.nesterov.pizza.constants.Constants
import com.nesterov.pizza.data.Categories
import com.nesterov.pizza.data.Food
import com.nesterov.pizza.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    lateinit var binding: ActivityMainBinding

    lateinit var itemList: ArrayList<Categories>
    lateinit var itemAdapter: AdapterCategories

    lateinit var itemListFood: ArrayList<Food>
    lateinit var itemAdapterPopularFood: AdapterPopularFood

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

        itemList.add(Categories(R.drawable.cat_1, R.drawable.category_backgrount, R.string.cat1))
        itemList.add(Categories(R.drawable.cat_2, R.drawable.category_backgrount2, R.string.cat2))
        itemList.add(Categories(R.drawable.cat_3, R.drawable.category_backgrount3, R.string.cat3))
        itemList.add(Categories(R.drawable.cat_4, R.drawable.category_backgrount4, R.string.cat4))
        itemList.add(Categories(R.drawable.cat_5, R.drawable.category_backgrount5, R.string.cat5))
        itemList.add(Categories(R.drawable.cat_6, R.drawable.category_backgrount6, R.string.cat6))
        itemList.add(Categories(R.drawable.cat_7, R.drawable.category_backgrount7, R.string.cat7))
        itemList.add(Categories(R.drawable.cat_8, R.drawable.category_backgrount8, R.string.cat8))

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

        itemListFood.add(Food(
            R.drawable.pop_1,
            R.string.pizza1_title,
            R.string.dessert1_description,
            199.00))
        itemListFood.add(Food(
            R.drawable.cat_2,
            R.string.roles_title,
            R.string.dessert2_description, 210.00))
        itemListFood.add(Food(
            R.drawable.pop_3,
            R.string.pizza3_title,
            R.string.dessert3_description, 180.00))
        itemListFood.add(Food(
            R.drawable.cat_4,
            R.string.salad11_title,
            R.string.salad11_description, 150.00)
            )

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
                intentItemListPopularFood(0)
            } else
            if (itemOnClick.image == R.drawable.cat_2){
                intentItemListPopularFood(1)
            } else
            if (itemOnClick.image == R.drawable.pop_3){
                intentItemListPopularFood(2)
            } else
            if (itemOnClick.image == R.drawable.cat_4){
                intentItemListPopularFood(3)
            }
        }
    }

    fun intentItemListPopularFood(index: Int){
        val i = Intent(this, ShowDetailActivity::class.java)
        i.putExtra(Constants.ITEM_LIST_POPULAR_FOOD, itemListFood[index])
        startActivity(i)
    }



}