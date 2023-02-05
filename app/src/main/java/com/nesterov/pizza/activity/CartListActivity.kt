package com.nesterov.pizza.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isEmpty
import androidx.core.view.isNotEmpty
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.nesterov.pizza.adapter.AdapterCartList
import com.nesterov.pizza.bd.MainBD
import com.nesterov.pizza.bd.ManagementFood
import com.nesterov.pizza.data.FoodCart
import com.nesterov.pizza.databinding.ActivityCartListBinding
import kotlinx.coroutines.launch


class CartListActivity : AppCompatActivity() {

    lateinit var binding: ActivityCartListBinding
    private var mAdapter: AdapterCartList? = null

    private val tax = 100
    private var moneyAdd: Double = 0.0
    val managementFood = ManagementFood()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCartListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        openRecyclerView()

        binding.apply {
            homeBtn.setOnClickListener {
                val i = Intent(this@CartListActivity, MainActivity::class.java)
                startActivity(i)
                finish()
            }

            deliveryCheckBox.setOnClickListener {
                checkBox()
            }

            empty()

        }
    }

    private fun checkBox() = with(binding) {
        if (deliveryCheckBox.isChecked) {
            taxi.visibility = View.VISIBLE
            taxManyTxt.text = tax.toString()
            val moneyTaxi =
                totalManyTxt.text.toString().toDouble() + taxManyTxt.text.toString().toDouble()
            totalManyTxt.text = moneyTaxi.toString()
        } else {
            taxi.visibility = View.GONE
            val moneyTaxi = totalManyTxt.text.toString().toDouble() - tax
            totalManyTxt.text = moneyTaxi.toString()
        }
    }

    private fun empty() = with(binding) {
        if (cartRecyclerView.isNotEmpty()) {
            scrollView.visibility = View.GONE
            emptyTxt.visibility = View.VISIBLE
        } else {
            scrollView.visibility = View.VISIBLE
            emptyTxt.visibility = View.GONE
        }
    }

    private fun setAdapter(list: List<FoodCart>) {
        mAdapter?.setData(list)
    }

    private fun openRecyclerView() = with(binding) {
        lifecycleScope.launch {
            val foodCartList = MainBD(this@CartListActivity)
                .getFoodCartDao()
                .getAllFoodCart()

            moneyAdd =  managementFood.totalMoneyFood(foodCartList, allFoodTxt, totalManyTxt)

            mAdapter = AdapterCartList()

            cartRecyclerView.apply {
                layoutManager = LinearLayoutManager(this@CartListActivity)
                adapter = mAdapter

                setAdapter(foodCartList)

                mAdapter?.setOnActionUpdateListener {
                    lifecycleScope.launch {

                        MainBD(this@CartListActivity).getFoodCartDao().updateFoodCart(it)
                    }
                }

                mAdapter?.setOnActionDeleteListener {
                    val builder = AlertDialog.Builder(this@CartListActivity)
                    builder.setMessage("Ви дійсно хочете видалити?")
                    builder.setPositiveButton("Так") { p0, p1 ->
                        lifecycleScope.launch {
                            MainBD(this@CartListActivity).getFoodCartDao().deleteFoodCart(it)
                            val list = MainBD(this@CartListActivity)
                                .getFoodCartDao()
                                .getAllFoodCart()
                            setAdapter(list)
                        }
                        p0.dismiss()
                    }
                    builder.setNegativeButton("Ні") { p0, p1 ->
                        p0.dismiss()
                    }
                    val dialog = builder.create()
                    dialog.show()
                }
            }

        }
    }

}