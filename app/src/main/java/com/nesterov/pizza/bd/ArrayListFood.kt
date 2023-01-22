package com.nesterov.pizza.bd

import com.nesterov.pizza.R
import com.nesterov.pizza.data.Categories
import com.nesterov.pizza.data.Food

class ArrayListFood {

    fun categoriesListFood(itemList: ArrayList<Categories>){
        itemList.add(Categories(R.drawable.cat_1, R.drawable.category_backgrount, R.string.cat1))
        itemList.add(Categories(R.drawable.cat_2, R.drawable.category_backgrount2, R.string.cat2))
        itemList.add(Categories(R.drawable.cat_3, R.drawable.category_backgrount3, R.string.cat3))
        itemList.add(Categories(R.drawable.cat_4, R.drawable.category_backgrount4, R.string.cat4))
        itemList.add(Categories(R.drawable.cat_5, R.drawable.category_backgrount5, R.string.cat5))
        itemList.add(Categories(R.drawable.cat_6, R.drawable.category_backgrount6, R.string.cat6))
        itemList.add(Categories(R.drawable.cat_7, R.drawable.category_backgrount7, R.string.cat7))
        itemList.add(Categories(R.drawable.cat_8, R.drawable.category_backgrount8, R.string.cat8))
    }

    fun popularListFood(itemList: ArrayList<Food>){
        itemList.add(Food(R.drawable.pop_1, R.string.pizza1_title, R.string.dessert1_description, 199.00))
        itemList.add(Food(R.drawable.cat_2, R.string.roles_title, R.string.dessert2_description, 210.00))
        itemList.add(Food(R.drawable.pop_3, R.string.pizza3_title, R.string.dessert3_description, 180.00))
        itemList.add(Food(R.drawable.cat_4, R.string.salad11_title, R.string.salad11_description, 150.00)
        )
    }

    fun pizzaListFood(itemList: ArrayList<Food>){
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

    fun additionListFood(itemList: ArrayList<Food>){
        itemList.add(Food(R.drawable.addition1, R.string.addition1_title, R.string.addition1_description, 15.00))
        itemList.add(Food(R.drawable.addition2, R.string.addition2_title, R.string.addition2_description, 15.00))
        itemList.add(Food(R.drawable.addition3, R.string.addition3_title, R.string.addition3_description, 15.00))
        itemList.add(Food(R.drawable.addition4, R.string.addition4_title, R.string.addition1_description, 15.00))
        itemList.add(Food(R.drawable.addition5, R.string.addition5_title, R.string.addition1_description, 15.00))
        itemList.add(Food(R.drawable.addition6, R.string.addition6_title, R.string.addition1_description, 15.00))
        itemList.add(Food(R.drawable.addition7, R.string.addition7_title, R.string.addition1_description, 15.00))
    }

}