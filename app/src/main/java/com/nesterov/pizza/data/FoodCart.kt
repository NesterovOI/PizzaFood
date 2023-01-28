package com.nesterov.pizza.data

import android.os.Parcel
import android.os.Parcelable

data class FoodCart(
    var image: Int,
    var title: String?,
    var number: Int,
    var money: Double,
    var totalMoney: Double
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readDouble(),
        parcel.readDouble()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
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
