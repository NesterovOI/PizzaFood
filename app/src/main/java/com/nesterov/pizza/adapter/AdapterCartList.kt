package com.nesterov.pizza.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nesterov.pizza.R
import com.nesterov.pizza.data.FoodCart

class AdapterCartList: RecyclerView.Adapter<ViewHolderCartList>() {

    private val list = mutableListOf<FoodCart>()
    private var actionDelete: ((FoodCart) -> Unit)? = null
    private var actionUpdate: ((FoodCart) -> Unit)? = null


    var sum: Double = 0.0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderCartList {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.viewholder_cart, parent, false)
        return ViewHolderCartList(view)
    }

    override fun onBindViewHolder(holder: ViewHolderCartList, position: Int) {
        val foodCart = list[position]

        holder.image.setImageResource(foodCart.image)
        holder.title.text = foodCart.title
        holder.number.text = foodCart.number.toString()
        holder.money.text = foodCart.money.toString()
        holder.totalMoney.text = foodCart.totalMoney.toString()

        holder.plusCartBtn.setOnClickListener {

            val many = holder.money.text.toString().toDouble()
            var number = holder.number.text.toString().toInt()
            val s = number
            number++
            sum = (many * number)
            holder.number.text = number.toString()
            holder.totalMoney.text = sum.toString()

        }

        holder.minusCartBtn.setOnClickListener {

            val many = holder.money.text.toString().toDouble()
            val manyTotal = holder.totalMoney.text.toString().toDouble()
            var number = holder.number.text.toString().toInt()

                number--
                holder.number.text = number.toString()
                sum = manyTotal - many
                holder.totalMoney.text = sum.toString()

                if (number == 0) {
                    actionDelete?.invoke(foodCart)
                }

            }

    }

    override fun getItemCount() = list.size

    fun setData(foodCart: List<FoodCart>){
        list.apply {
            clear()
            addAll(foodCart)
        }
        notifyDataSetChanged()
    }

    fun setOnActionUpdateListener(callback: ((FoodCart) -> Unit)){
        this.actionUpdate = callback
    }

    fun setOnActionDeleteListener(callback: ((FoodCart) -> Unit)){
        this.actionDelete = callback
    }
}
