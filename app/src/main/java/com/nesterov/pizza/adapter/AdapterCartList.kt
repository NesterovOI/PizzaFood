package com.nesterov.pizza.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nesterov.pizza.R
import com.nesterov.pizza.data.Food
import com.nesterov.pizza.data.FoodCart

class AdapterCartList : RecyclerView.Adapter<ViewHolderCartList>() {

   val foodList = ArrayList<FoodCart>()
    var itemClick: ((FoodCart)->Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderCartList {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.viewholder_cart, parent, false)
        return ViewHolderCartList(view)
    }

    override fun onBindViewHolder(holder: ViewHolderCartList, position: Int) {
       // val itemClickMenu = foodList[position]
        holder.bind(foodList[position])

        holder.plusCartBtn.setOnClickListener{
            val many = holder.money.text.toString().toDouble()
            var number = holder.number.toString().toInt()
            number++
            val sum = many * number
            holder.number.text = number.toString()
            holder.totalMoney.text = sum.toString()
        }

        holder.minusCartBtn.setOnClickListener{
            val many = holder.money.text.toString().toDouble()
            var number = holder.number.toString().toInt()
            if (number > 1){
                number--
                holder.number.setText(number)
                val sum = many / number
                holder.totalMoney.text = sum.toString()
            }
        }
//        holder.itemView.setOnClickListener{
//            itemClick?.invoke(itemClickMenu)
//        }
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    fun addFoodDomain(food: FoodCart){
        foodList.add(food)
        notifyDataSetChanged()
    }
}
