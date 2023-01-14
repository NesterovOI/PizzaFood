package com.nesterov.pizza.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nesterov.pizza.R
import com.nesterov.pizza.data.Pizza

class AdapterPizza(private val activityListPizza: ArrayList<Pizza>):
RecyclerView.Adapter<ViewHolderPizza>(){

    private var itemClick: ((Pizza)->Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderPizza {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_category,
            parent,false)
        return ViewHolderPizza(view)
    }

    override fun onBindViewHolder(holder: ViewHolderPizza, position: Int) {
        val itemClickMenu = activityListPizza[position]
        holder.imageView.setImageResource(itemClickMenu.image)
        holder.textName.setText(itemClickMenu.title)
        holder.mainLayout.setBackgroundResource(itemClickMenu.fonLayout)

        holder.itemView.setOnClickListener{
            itemClick?.invoke(itemClickMenu)
        }
    }

    override fun getItemCount(): Int {
        return activityListPizza.size
    }
}