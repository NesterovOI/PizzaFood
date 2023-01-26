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

    fun dessertListFood(itemList: ArrayList<Food>){
        itemList.add(Food(R.drawable.dessert1, R.string.dessert1_title, R.string.dessert1_description, 120.00))
        itemList.add(Food(R.drawable.dessert2, R.string.dessert2_title, R.string.dessert2_description, 120.00))
        itemList.add(Food(R.drawable.dessert3, R.string.dessert3_title, R.string.dessert3_description, 120.00))
    }

    fun drinksListFood(itemList: ArrayList<Food>){
        itemList.add(Food(R.drawable.drinks1, R.string.drinks1_title, R.string.drinks1_description, 25.00))
        itemList.add(Food(R.drawable.drinks2, R.string.drinks2_title, R.string.drinks2_description, 25.00))
        itemList.add(Food(R.drawable.drinks3, R.string.drinks3_title, R.string.drinks3_description, 25.00))
        itemList.add(Food(R.drawable.drinks4, R.string.drinks4_title, R.string.drinks4_description, 30.00))
        itemList.add(Food(R.drawable.drinks5, R.string.drinks5_title, R.string.drinks5_description, 30.00))
    }

    fun networksListFood(itemList: ArrayList<Food>){
        itemList.add(Food(R.drawable.networks1, R.string.networks1_title, R.string.networks1_description, 500.00))
        itemList.add(Food(R.drawable.networks2, R.string.networks2_title, R.string.networks2_description, 500.00))
        itemList.add(Food(R.drawable.networks3, R.string.networks3_title, R.string.networks3_description, 500.00))
        itemList.add(Food(R.drawable.networks4, R.string.networks4_title, R.string.networks4_description, 500.00))
        itemList.add(Food(R.drawable.networks5, R.string.networks5_title, R.string.networks5_description, 500.00))
        itemList.add(Food(R.drawable.networks6, R.string.networks6_title, R.string.networks6_description, 500.00))
        itemList.add(Food(R.drawable.networks7, R.string.networks7_title, R.string.networks7_description, 500.00))
        itemList.add(Food(R.drawable.networks8, R.string.networks8_title, R.string.networks8_description, 500.00))
        itemList.add(Food(R.drawable.networks9, R.string.networks9_title, R.string.networks9_description, 500.00))
        itemList.add(Food(R.drawable.networks10, R.string.networks10_title, R.string.networks10_description, 500.00))
        itemList.add(Food(R.drawable.networks11, R.string.networks11_title, R.string.networks11_description, 500.00))
        itemList.add(Food(R.drawable.networks12, R.string.networks12_title, R.string.networks12_description, 500.00))
        itemList.add(Food(R.drawable.networks13, R.string.networks13_title, R.string.networks13_description, 500.00))
        itemList.add(Food(R.drawable.networks14, R.string.networks14_title, R.string.networks14_description, 500.00))
        itemList.add(Food(R.drawable.networks15, R.string.networks15_title, R.string.networks15_description, 500.00))
        itemList.add(Food(R.drawable.networks16, R.string.networks16_title, R.string.networks16_description, 500.00))
        itemList.add(Food(R.drawable.networks17, R.string.networks17_title, R.string.networks17_description, 500.00))
        itemList.add(Food(R.drawable.networks18, R.string.networks18_title, R.string.networks18_description, 500.00))
        itemList.add(Food(R.drawable.networks19, R.string.networks19_title, R.string.networks19_description, 500.00))
        itemList.add(Food(R.drawable.networks20, R.string.networks20_title, R.string.networks20_description, 500.00))
        itemList.add(Food(R.drawable.networks21, R.string.networks21_title, R.string.networks21_description, 500.00))
        itemList.add(Food(R.drawable.networks22, R.string.networks22_title, R.string.networks22_description, 500.00))
        itemList.add(Food(R.drawable.networks23, R.string.networks23_title, R.string.networks23_description, 500.00))
        itemList.add(Food(R.drawable.networks24, R.string.networks24_title, R.string.networks24_description, 500.00))
    }

    fun rolesListFood(itemList: ArrayList<Food>){
        itemList.add(Food(R.drawable.roles1, R.string.roles1_title, R.string.roles1_description, 300.00))
        itemList.add(Food(R.drawable.roles2, R.string.roles2_title, R.string.roles2_description, 300.00))
        itemList.add(Food(R.drawable.roles3, R.string.roles3_title, R.string.roles3_description, 300.00))
        itemList.add(Food(R.drawable.roles4, R.string.roles4_title, R.string.roles4_description, 300.00))
        itemList.add(Food(R.drawable.roles5, R.string.roles5_title, R.string.roles5_description, 300.00))
        itemList.add(Food(R.drawable.roles6, R.string.roles6_title, R.string.roles6_description, 300.00))
        itemList.add(Food(R.drawable.roles7, R.string.roles7_title, R.string.roles7_description, 300.00))
        itemList.add(Food(R.drawable.roles8, R.string.roles8_title, R.string.roles8_description, 300.00))
        itemList.add(Food(R.drawable.roles9, R.string.roles9_title, R.string.roles9_description, 300.00))
        itemList.add(Food(R.drawable.roles10, R.string.roles10_title, R.string.roles10_description, 300.00))
        itemList.add(Food(R.drawable.roles11, R.string.roles11_title, R.string.roles11_description, 300.00))
        itemList.add(Food(R.drawable.roles12, R.string.roles12_title, R.string.roles12_description, 300.00))
        itemList.add(Food(R.drawable.roles13, R.string.roles13_title, R.string.roles13_description, 300.00))
        itemList.add(Food(R.drawable.roles14, R.string.roles14_title, R.string.roles14_description, 300.00))
        itemList.add(Food(R.drawable.roles15, R.string.roles15_title, R.string.roles15_description, 300.00))
        itemList.add(Food(R.drawable.roles16, R.string.roles16_title, R.string.roles16_description, 300.00))
        itemList.add(Food(R.drawable.roles17, R.string.roles17_title, R.string.roles17_description, 300.00))
        itemList.add(Food(R.drawable.roles18, R.string.roles18_title, R.string.roles18_description, 300.00))
        itemList.add(Food(R.drawable.roles19, R.string.roles19_title, R.string.roles19_description, 300.00))
        itemList.add(Food(R.drawable.roles20, R.string.roles20_title, R.string.roles20_description, 300.00))
        itemList.add(Food(R.drawable.roles21, R.string.roles21_title, R.string.roles21_description, 300.00))
        itemList.add(Food(R.drawable.roles22, R.string.roles22_title, R.string.roles22_description, 300.00))
        itemList.add(Food(R.drawable.roles23, R.string.roles23_title, R.string.roles23_description, 300.00))
    }

    fun saladListFood(itemList: ArrayList<Food>){
        itemList.add(Food(R.drawable.salad1, R.string.salad1_title, R.string.salad1_description, 120.00))
        itemList.add(Food(R.drawable.salad2, R.string.salad2_title, R.string.salad2_description, 120.00))
        itemList.add(Food(R.drawable.salad3, R.string.salad3_title, R.string.salad3_description, 120.00))
        itemList.add(Food(R.drawable.salad4, R.string.salad4_title, R.string.salad4_description, 120.00))
        itemList.add(Food(R.drawable.salad5, R.string.salad5_title, R.string.salad5_description, 120.00))
        itemList.add(Food(R.drawable.salad6, R.string.salad6_title, R.string.salad6_description, 120.00))
        itemList.add(Food(R.drawable.salad7, R.string.salad7_title, R.string.salad7_description, 120.00))
        itemList.add(Food(R.drawable.salad8, R.string.salad8_title, R.string.salad8_description, 120.00))
        itemList.add(Food(R.drawable.salad9, R.string.salad9_title, R.string.salad9_description, 120.00))
        itemList.add(Food(R.drawable.salad10, R.string.salad10_title, R.string.salad10_description, 120.00))
        itemList.add(Food(R.drawable.salad11, R.string.salad11_title, R.string.salad11_description, 120.00))
        itemList.add(Food(R.drawable.salad12, R.string.salad12_title, R.string.salad12_description, 120.00))
        itemList.add(Food(R.drawable.salad13, R.string.salad13_title, R.string.salad13_description, 120.00))
        itemList.add(Food(R.drawable.salad14, R.string.salad14_title, R.string.salad14_description, 120.00))
        itemList.add(Food(R.drawable.salad15, R.string.salad15_title, R.string.salad15_description, 120.00))
        itemList.add(Food(R.drawable.salad16, R.string.salad16_title, R.string.salad16_description, 120.00))
    }

    fun soupsListFood(itemList: ArrayList<Food>){
        itemList.add(Food(R.drawable.soups1, R.string.soups1_title, R.string.soups1_description, 110.00))
        itemList.add(Food(R.drawable.soups2, R.string.soups2_title, R.string.soups2_description, 110.00))
        itemList.add(Food(R.drawable.soups3, R.string.soups3_title, R.string.soups3_description, 110.00))
        itemList.add(Food(R.drawable.soups4, R.string.soups4_title, R.string.soups4_description, 110.00))
        itemList.add(Food(R.drawable.soups5, R.string.soups5_title, R.string.soups5_description, 110.00))
        itemList.add(Food(R.drawable.soups6, R.string.soups6_title, R.string.soups6_description, 110.00))
        itemList.add(Food(R.drawable.soups7, R.string.soups7_title, R.string.soups7_description, 110.00))
    }

}