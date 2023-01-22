package com.nesterov.pizza.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nesterov.pizza.R
import com.nesterov.pizza.data.Food

class AdapterCategoriesList(val listCategories: ArrayList<Food>): RecyclerView.Adapter<ViewHolderCategoriesList>() {

    var itemClick: ((Food) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderCategoriesList {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_category, parent, false)
        return ViewHolderCategoriesList(view)
    }

    override fun onBindViewHolder(holder: ViewHolderCategoriesList, position: Int) {
        val itemClickMenu = listCategories[position]

        holder.image.setImageResource(itemClickMenu.image)
        holder.title.text = itemClickMenu.title.toString()
        holder.description.text = itemClickMenu.description.toString()
        holder.money.text = itemClickMenu.money.toString()

        holder.itemView.setOnClickListener{
            itemClick?.invoke(itemClickMenu)
        }
    }

    override fun getItemCount(): Int {
        return listCategories.size
    }
}