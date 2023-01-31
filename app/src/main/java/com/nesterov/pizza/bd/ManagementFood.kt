package com.nesterov.pizza.bd

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.RecyclerView
import com.nesterov.pizza.activity.MainActivity
import com.nesterov.pizza.activity.ShowDetailActivity
import com.nesterov.pizza.constants.Constants
import com.nesterov.pizza.data.Categories
import com.nesterov.pizza.data.Food
import com.nesterov.pizza.data.FoodCart
import java.util.Locale

class ManagementFood {

   // private lateinit var findItemList: ArrayList<Food>

    fun totalMoneyFood(food: ArrayList<FoodCart>): Double{

        var money = 0.0

        for (index in food){
          //  money += index.totalMoney
        }

        return money
    }

    fun intentItemList(context: Context, index: Int, itemList: ArrayList<Food>){
        val i = Intent(context, ShowDetailActivity::class.java)
        i.putExtra(Constants.ITEM_LIST_POPULAR_FOOD, itemList[index])
        context.startActivity(i)
    }

    fun initFind(findItemList: ArrayList<Food>, searchView: android.widget.SearchView, recyclerView: RecyclerView, itemList: ArrayList<Food>){

        findItemList.addAll(itemList)

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            android.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean = true

            @SuppressLint("NotifyDataSetChanged")
            override fun onQueryTextChange(newText: String?): Boolean {

                if (newText!!.isNotEmpty()){
                    findItemList.clear()
                    val search = newText.toLowerCase(Locale.getDefault())

                    itemList.forEach {
                        if (it.title.toString().toLowerCase(Locale.getDefault()).contains(search)){
                            findItemList.add(it)
                        }
                    }
                    recyclerView.adapter!!.notifyDataSetChanged()
                }
                else{
                    findItemList.clear()
                    findItemList.addAll(itemList)
                    recyclerView.adapter!!.notifyDataSetChanged()
                }
                return true
            }

        })

    }

    fun initFindCategories(findItemList: ArrayList<Categories>, searchView: android.widget.SearchView,
                           recyclerView: RecyclerView, itemList: ArrayList<Categories>){

        findItemList.addAll(itemList)

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            android.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean = true

            @SuppressLint("NotifyDataSetChanged")
            override fun onQueryTextChange(newText: String?): Boolean {

                if (newText!!.isNotEmpty()){
                    findItemList.clear()
                    val search = newText.toLowerCase(Locale.getDefault())

                    itemList.forEach {
                        if (it.title.toString().toLowerCase(Locale.getDefault()).contains(search)){
                            findItemList.add(it)
                        }
                    }
                    recyclerView.adapter!!.notifyDataSetChanged()
                }
                else{
                    findItemList.clear()
                    findItemList.addAll(itemList)
                    recyclerView.adapter!!.notifyDataSetChanged()
                }
                return true
            }

        })

    }

}
