package com.nesterov.pizza.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.nesterov.pizza.R
import com.nesterov.pizza.data.Categories


class ViewHolderCategories(itemView: View): RecyclerView.ViewHolder(itemView) {

    val imageView: ImageView = itemView.findViewById(R.id.categoryPic)
    val textName: TextView = itemView.findViewById(R.id.textName)
    val mainLayout: ConstraintLayout = itemView.findViewById(R.id.mainLayout)

}