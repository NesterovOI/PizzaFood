package com.nesterov.pizza.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nesterov.pizza.R

class ViewHolderPopularFood(itemView: View): RecyclerView.ViewHolder(itemView) {

    val image: ImageView = itemView.findViewById(R.id.image)
    val title: TextView = itemView.findViewById(R.id.titlePopular)
    val money: TextView = itemView.findViewById(R.id.money)
    val addBtn: TextView = itemView.findViewById(R.id.addBtn)

}