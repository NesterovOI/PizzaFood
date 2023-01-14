package com.nesterov.pizza.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nesterov.pizza.R
import com.nesterov.pizza.data.Food

class AdapterPopularFood(val activityListPopular: ArrayList<Food>):
    RecyclerView.Adapter<ViewHolderPopularFood>() {

    var itemClick: ((Food)->Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderPopularFood {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_popular, parent, false)
        return ViewHolderPopularFood(view)
    }

    override fun onBindViewHolder(holder: ViewHolderPopularFood, position: Int) {
        val itemClickMenu = activityListPopular[position]
        holder.image.setImageResource(itemClickMenu.image)
        holder.title.setText(itemClickMenu.title)
        holder.money.text = itemClickMenu.money.toString()
        holder.itemView.setOnClickListener{
            itemClick?.invoke(itemClickMenu)
        }
    }

    override fun getItemCount(): Int {
        return activityListPopular.size
    }
}