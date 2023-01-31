package com.nesterov.pizza.bd

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.nesterov.pizza.data.FoodCart

@Database(entities = [FoodCart::class], version = 1)
abstract class MainBD: RoomDatabase()  {

    companion object{
        fun getDB(context: Context):MainBD{
            return Room.databaseBuilder(
                context.applicationContext,
                MainBD::class.java,
                "food.db"
            ).build()
        }
    }

}