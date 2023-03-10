package com.nesterov.pizza.data

import android.os.Parcel
import android.os.Parcelable

data class Food(
    var image: Int,
    var title: String?,
    var description: Int,
    var money: Double,
    var numberInCart: Int,
    var totalMoney: Double
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readDouble(),
        parcel.readInt(),
        parcel.readDouble()
    ) {
    }

    constructor(
        image: Int,
        title: String,
        description: Int,
        money: Double
    ) : this(image, title, description, money, numberInCart = 0, totalMoney = 0.0)

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(title)
        parcel.writeInt(description)
        parcel.writeDouble(money)
        parcel.writeInt(numberInCart)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Food> {
        override fun createFromParcel(parcel: Parcel): Food {
            return Food(parcel)
        }

        override fun newArray(size: Int): Array<Food?> {
            return arrayOfNulls(size)
        }
    }
}

