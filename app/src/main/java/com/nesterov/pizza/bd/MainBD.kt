package com.nesterov.pizza.bd

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database()
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