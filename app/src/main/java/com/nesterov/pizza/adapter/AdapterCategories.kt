package com.nesterov.pizza.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nesterov.pizza.R
import com.nesterov.pizza.data.Categories

class AdapterCategories(private val activityListCategories: ArrayList<Categories>):
RecyclerView.Adapter<ViewHolderCategories>(){

    var itemClick: ((Categories)->Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderCategories {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_category,
            parent,false)
        return ViewHolderCategories(view)
    }

    override fun onBindViewHolder(holder: ViewHolderCategories, position: Int) {

        val itemClickMenu = activityListCategories[position]
        holder.imageView.setImageResource(itemClickMenu.image)
        holder.textName.setText(itemClickMenu.title)
        holder.mainLayout.setBackgroundResource(itemClickMenu.fonLayout)

        holder.itemView.setOnClickListener{
            itemClick?.invoke(itemClickMenu)
        }
    }

    override fun getItemCount(): Int {
        return activityListCategories.size
    }
}