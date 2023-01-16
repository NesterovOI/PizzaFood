package com.nesterov.pizza.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.nesterov.pizza.R
import com.nesterov.pizza.data.Food
import com.nesterov.pizza.data.FoodCart
import android.widget.Toast.makeText as x

class AdapterCartList : RecyclerView.Adapter<ViewHolderCartList>() {

   val foodList = ArrayList<FoodCart>()
    var itemClick: ((FoodCart)->Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderCartList {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.viewholder_cart, parent, false)
        return ViewHolderCartList(view)
    }

    override fun onBindViewHolder(holder: ViewHolderCartList, position: Int) {
        val itemClickMenu = foodList[position]
        holder.bind(foodList[position])


        holder.plusCartBtn.setOnClickListener{
            val many = holder.money.text.toString().toDouble()
            val manyTotal = holder.totalMoney.text.toString().toDouble()
            var number = holder.number.text.toString().toInt()
            number++
            val sum = (many * number)
            holder.number.text = number.toString()
            holder.totalMoney.text = sum.toString()
        }

        holder.minusCartBtn.setOnClickListener{
            val many = holder.money.text.toString().toDouble()
            val manyTotal = holder.totalMoney.text.toString().toDouble()
            var number = holder.number.text.toString().toInt()
            if (number > 1){
                number--
                holder.number.text = number.toString()
                val sum = manyTotal - many
                holder.totalMoney.text = sum.toString()
            }
        }

    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    fun addFoodDomain(food: FoodCart){
        foodList.add(food)
        notifyDataSetChanged()
    }
}
