package com.nesterov.pizza.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nesterov.pizza.R
import com.nesterov.pizza.data.Food

class AdapterCategoriesList(val listCategories: ArrayList<Food>):
    RecyclerView.Adapter<ViewHolderCategoriesList>() {

    var itemClick: ((Food) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderCategoriesList {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_category_activity,
            parent, false)

        return ViewHolderCategoriesList(view)
    }

    override fun onBindViewHolder(holder: ViewHolderCategoriesList, position: Int) {
        val itemClickMenu = listCategories[position]

        holder.image.setImageResource(itemClickMenu.image)
        holder.title.setText(itemClickMenu.title)
        holder.description.setText(itemClickMenu.description)
        holder.money.text = itemClickMenu.money.toString()

        holder.itemView.setOnClickListener{
            itemClick?.invoke(itemClickMenu)
        }
    }

    override fun getItemCount(): Int {
        return listCategories.size
    }
}