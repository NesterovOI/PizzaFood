package com.nesterov.pizza.data

import android.os.Parcel
import android.os.Parcelable

data class FoodMenu(
    val image: Int,
    val fonLayout: Int,
    val title: Int,
    val description: Int,
    val numberInCart: Int,
    val money: Double,
    val totalMoney: Double
                    ): Parcelable
{
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readDouble(),
        parcel.readDouble()
    ) {
    }

    constructor(
        image: Int,
        fonLayout: Int,
        title: Int
    ): this(image, fonLayout, title, description = 0, numberInCart = 0, money = 0.0, totalMoney = 0.0)

    constructor(
        image: Int,
        title: Int,
        description: Int,
        money: Double
    ): this(image, fonLayout = 0, title, description, numberInCart = 0, money, totalMoney = 0.0)

    constructor(
        image: Int,
        title: Int,
        description: Int,
        numberInCart: Int,
        money: Double
    ): this(image, fonLayout = 0, title, description = 0, numberInCart, money, totalMoney = 0.0)

    constructor(
        image: Int,
        title: Int,
        money: Double
    ): this(image, fonLayout = 0, title, description = 0, numberInCart = 0, money, totalMoney = 0.0)

    constructor(
        image: Int,
        title: Int,
        numberInCart: Int,
        money: Double,
        totalMoney: Double
    ): this(image, fonLayout = 0, title, description = 0, numberInCart, money, totalMoney)

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(p0: Parcel?, p1: Int) {
        TODO("Not yet implemented")
    }

    companion object CREATOR : Parcelable.Creator<FoodMenu> {
        override fun createFromParcel(parcel: Parcel): FoodMenu {
            return FoodMenu(parcel)
        }

        override fun newArray(size: Int): Array<FoodMenu?> {
            return arrayOfNulls(size)
        }
    }


}
