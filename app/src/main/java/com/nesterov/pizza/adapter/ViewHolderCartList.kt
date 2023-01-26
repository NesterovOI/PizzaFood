package com.nesterov.pizza.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nesterov.pizza.R
import com.nesterov.pizza.`interface`.SumaCartListActivity
import com.nesterov.pizza.data.FoodCart

class ViewHolderCartList(item: View): RecyclerView.ViewHolder(item) {

    val image : ImageView = item.findViewById(R.id.imageListCart)
    val title: TextView = item.findViewById(R.id.titleListTxt)
    val money: TextView = item.findViewById(R.id.foodMoney)
    val totalMoney: TextView = item.findViewById(R.id.totalMoneyCartTxt)
    val minusCartBtn: ImageView = item.findViewById(R.id.minusCartBtn)
    val plusCartBtn: ImageView = item.findViewById(R.id.plusCartBtn)
    val number: TextView = item.findViewById(R.id.numberItemTxt)

    fun bind(food: FoodCart, sumaCartListActivity: SumaCartListActivity){
        image.setImageResource(food.image)
        title.text = food.title
        number.text = food.number.toString()
        money.text = food.money.toString()
        totalMoney.text = food.totalMoney.toString()
    }

}