package com.nesterov.pizza.bd

import com.nesterov.pizza.data.FoodCart

class ManagementCart {

    fun totalMoneyFood(food: ArrayList<FoodCart>): Double{

        var money = 0.0

        for (index in food){
            money += index.totalMoney
        }

        return money
    }

}