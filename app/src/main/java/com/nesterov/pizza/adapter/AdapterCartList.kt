package com.nesterov.pizza.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nesterov.pizza.R
import com.nesterov.pizza.`interface`.SumaCartListActivity
import com.nesterov.pizza.data.FoodCart

class AdapterCartList : RecyclerView.Adapter<ViewHolderCartList>(), SumaCartListActivity {

    val foodList = ArrayList<FoodCart>()
    var itemClick: ((FoodCart) -> Unit)? = null
    var sum: Double = 0.0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderCartList {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.viewholder_cart, parent, false)
        return ViewHolderCartList(view)
    }

    override fun onBindViewHolder(holder: ViewHolderCartList, position: Int) {
        holder.bind(foodList[position])

        holder.plusCartBtn.setOnClickListener {
            val many = holder.money.text.toString().toDouble()
            var number = holder.number.text.toString().toInt()
            number++
            sum = (many * number)
            holder.number.text = number.toString()
            holder.totalMoney.text = sum.toString()

        }

        holder.minusCartBtn.setOnClickListener {
            val many = holder.money.text.toString().toDouble()
            val manyTotal = holder.totalMoney.text.toString().toDouble()
            var number = holder.number.text.toString().toInt()
            if (number > 1) {
                number--
                holder.number.text = number.toString()
                sum = manyTotal - many
                holder.totalMoney.text = sum.toString()
            }
        }

    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    fun addFoodDomain(food: FoodCart) {
        foodList.add(food)
        notifyDataSetChanged()
    }

    override fun sumaCartList(foodCart: FoodCart) {
        foodCart.totalMoney = sum
    }
}
