package com.nesterov.pizza.data

import android.os.Parcel
import android.os.Parcelable

data class Categories(val image: Int, val fonLayout: Int, val title: String?): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeInt(fonLayout)
        parcel.writeString(title)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Categories> {
        override fun createFromParcel(parcel: Parcel): Categories {
            return Categories(parcel)
        }

        override fun newArray(size: Int): Array<Categories?> {
            return arrayOfNulls(size)
        }
    }
}
