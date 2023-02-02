package com.nesterov.pizza.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.nesterov.pizza.adapter.AdapterCartList
import com.nesterov.pizza.bd.MainBD
import com.nesterov.pizza.data.FoodCart
import com.nesterov.pizza.databinding.ActivityCartListBinding
import kotlinx.coroutines.launch


class CartListActivity : AppCompatActivity() {

    lateinit var binding: ActivityCartListBinding
    private var mAdapter: AdapterCartList? = null

    val tax = 100
    var numberAdd = 0
    var moneyAdd: Double = 0.0
    var totalMoneyAdd: Double = 0.0


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
        }
    }

    fun checkBox() = with(binding) {
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

    fun empty() = with(binding) {
        val sum: String = totalManyTxt.text.toString()
        if (sum == "0.0") {
            scrollView.visibility = View.GONE
            emptyTxt.visibility = View.VISIBLE
        } else {
            scrollView.visibility = View.VISIBLE
            emptyTxt.visibility = View.GONE
        }
    }
//
//    override fun addFoodTotalMoney(sum: Double): String {
//        binding.apply {
//            allFoodTxt.text = sum.toString()
//            totalManyTxt.text = sum.toString()
//            val totalManySum: Double = totalManyTxt.text.toString().toDouble()
//
//            // функція для знищення стрроки в скиску removeAt()
//
//            if (deliveryCheckBox.isChecked){
//                val res  = totalManySum + tax
//                totalManyTxt.text = res.toString()
//            }
//        }
//        return sum.toString()
//    }

    private fun setAdapter(list: List<FoodCart>) {
        mAdapter?.setData(list)
    }

    fun openRecyclerView() {
        lifecycleScope.launch {
            val foodCartList = MainBD(this@CartListActivity)
                .getFoodCartDao()
                .getAllFoodCart()

            mAdapter = AdapterCartList()

            binding.cartRecyclerView.apply {
                layoutManager = LinearLayoutManager(this@CartListActivity)
                adapter = mAdapter

                setAdapter(foodCartList)

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