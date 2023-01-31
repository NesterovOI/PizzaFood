package com.nesterov.pizza.bd

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.nesterov.pizza.data.FoodCart
import kotlinx.coroutines.flow.Flow

@Dao
interface Dao {
    @Insert
    fun insertFoodCart(foodCart: FoodCart)
    @Query("SELECT * FROM foodCart")
    fun getAllFoodCart(): Flow<List<FoodCart>>
}