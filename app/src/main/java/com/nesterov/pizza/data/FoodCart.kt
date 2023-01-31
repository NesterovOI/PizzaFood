package com.nesterov.pizza.data

import android.os.Parcel
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "foodCart")
data class FoodCart(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    @ColumnInfo(name = "image")
    var image: Int,
    @ColumnInfo(name = "title")
    var title: String?,
    @ColumnInfo(name = "number")
    var number: Int,
    @ColumnInfo(name = "money")
    var money: Double,
    @ColumnInfo(name = "totalMoney")
    var totalMoney: Double
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readDouble(),
        parcel.readDouble()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id!!)
        parcel.writeInt(image)
        parcel.writeString(title)
        parcel.writeInt(number)
        parcel.writeDouble(money)
        parcel.writeDouble(totalMoney)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<FoodCart> {
        override fun createFromParcel(parcel: Parcel): FoodCart {
            return FoodCart(parcel)
        }

        override fun newArray(size: Int): Array<FoodCart?> {
            return arrayOfNulls(size)
        }
    }
}
