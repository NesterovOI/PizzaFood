package com.nesterov.pizza.data

import android.os.Parcel
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "foodCart")
data class FoodCart(
   // @ColumnInfo(name = "image")
    var image: Int,
   // @ColumnInfo(name = "title")
    var title: String?,
 //   @ColumnInfo(name = "number")
    var number: Int,
  //  @ColumnInfo(name = "money")
    var money: Double,
  //  @ColumnInfo(name = "totalMoney")
    var totalMoney: Double
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
