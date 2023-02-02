package com.nesterov.pizza.bd

import androidx.room.*
import androidx.room.Dao
import com.nesterov.pizza.data.FoodCart
import kotlinx.coroutines.flow.Flow

@Dao
interface Dao {
    @Insert
    suspend fun addFoodCart(foodCart: FoodCart)

    @Query("SELECT * FROM foodCart ORDER BY id DESC")
    suspend fun getAllFoodCart(): List<FoodCart>

    @Update
    suspend fun updateFoodCart(foodCart: FoodCart)

    @Delete
    suspend fun deleteFoodCart(foodCart: FoodCart)
}