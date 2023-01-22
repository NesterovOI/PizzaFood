package com.nesterov.pizza.bd

import com.nesterov.pizza.R
import com.nesterov.pizza.data.Food

class ArrayListFood {

    fun pizzaListFood(itemList: ArrayList<Food>){

        //val itemList: ArrayList<Food> = ArrayList()

        itemList.add(Food(R.drawable.pizza1, R.string.pizza1_title, R.string.pizza1_description, 195.00))
        itemList.add(Food(R.drawable.pizza2, R.string.pizza2_title, R.string.pizza2_description, 185.00))
        itemList.add(Food(R.drawable.pizza3, R.string.pizza3_title, R.string.pizza3_description, 190.00))
        itemList.add(Food(R.drawable.pizza4, R.string.pizza4_title, R.string.pizza4_description, 190.00))
        itemList.add(Food(R.drawable.pizza5, R.string.pizza5_title, R.string.pizza5_description, 190.00))
        itemList.add(Food(R.drawable.pizza6, R.string.pizza6_title, R.string.pizza6_description, 190.00))
        itemList.add(Food(R.drawable.pizza7, R.string.pizza7_title, R.string.pizza7_description, 190.00))
        itemList.add(Food(R.drawable.pizza8, R.string.pizza8_title, R.string.pizza8_description, 190.00))
        itemList.add(Food(R.drawable.pizza9, R.string.pizza9_title, R.string.pizza9_description, 190.00))
        itemList.add(Food(R.drawable.pizza10, R.string.pizza10_title, R.string.pizza10_description, 190.00))
        itemList.add(Food(R.drawable.pizza11, R.string.pizza11_title, R.string.pizza11_description, 190.00))
        itemList.add(Food(R.drawable.pizza12, R.string.pizza12_title, R.string.pizza12_description, 190.00))
        itemList.add(Food(R.drawable.pizza13, R.string.pizza13_title, R.string.pizza13_description, 190.00))
    }

}