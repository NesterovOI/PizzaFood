package com.nesterov.pizza.bd

import android.content.Context
import android.content.Intent
import com.nesterov.pizza.activity.ShowDetailActivity
import com.nesterov.pizza.constants.Constants
import com.nesterov.pizza.data.Food
import com.nesterov.pizza.data.FoodCart

class ManagementFood {

    fun totalMoneyFood(food: ArrayList<FoodCart>): Double{

        var money = 0.0

        for (index in food){
            money += index.totalMoney
        }

        return money
    }

    fun intentItemList(context: Context, index: Int, itemList: ArrayList<Food>){
        val i = Intent(context, ShowDetailActivity::class.java)
        i.putExtra(Constants.ITEM_LIST_POPULAR_FOOD, itemList[index])
        context.startActivity(i)
    }

}