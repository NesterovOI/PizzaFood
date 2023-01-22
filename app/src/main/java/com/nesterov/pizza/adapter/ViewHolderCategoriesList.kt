package com.nesterov.pizza.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nesterov.pizza.R

class ViewHolderCategoriesList(itemView: View): RecyclerView.ViewHolder(itemView) {

    val image: ImageView = itemView.findViewById(R.id.imageCategories)
    val title: TextView = itemView.findViewById(R.id.titleCategories)
    val description: TextView = itemView.findViewById(R.id.descriptionCategories)
    val money: TextView = itemView.findViewById(R.id.moneyCategories)

}