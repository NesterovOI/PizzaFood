package com.nesterov.pizza.bd

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.nesterov.pizza.data.FoodCart

@Database(entities = [FoodCart::class], version = 1)
abstract class MainBD: RoomDatabase()  {

    abstract fun getFoodCartDao(): Dao

    companion object{
        @Volatile
        private var instance: MainBD? = null
        private val LOCK =  Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
            instance ?: buildDataBase(context).also {
                instance = it
            }
        }

        private fun buildDataBase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            MainBD::class.java,
            "app-database"
        ).build()
    }

}