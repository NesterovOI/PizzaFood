package com.nesterov.pizza.activity

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
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
    private var taxIntent = ""
    private var moneyAdd: Double = 0.0
    val managementFood = ManagementFood()
    private val addresses: List<String> = listOf("nesterov_ai@ukr.net")
    private val subject: String = "Прийміть замовлення"
    lateinit var attachment: ArrayList<FoodCart>


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

            buttonOrder.setOnClickListener {
                composeEmail(this@CartListActivity, addresses, subject, attachment)
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

            attachment = foodCartList as ArrayList<FoodCart>

            moneyAdd = managementFood.totalMoneyFood(foodCartList, allFoodTxt, totalManyTxt)

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

    fun composeEmail(
        context: Context,
        addresses: List<String>,
        subject: String,
        food: List<FoodCart>
    ) = with(binding) {
        val intent = Intent(Intent.ACTION_SEND)
        val fullSum = moneyAdd + tax
            if (deliveryCheckBox.isChecked){
                taxIntent = "Потрібна доставка продуктів $tax грн"
            }

        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_EMAIL, addresses.toTypedArray())
        intent.putExtra(Intent.EXTRA_SUBJECT, subject)

        var titleExtra = ""
        var numberExtra = 0
        var sumExtra = 0.0
        food.forEach{
            titleExtra = it.title.toString()
            numberExtra = it.number
            sumExtra = it.totalMoney
            val phone = getPhone()
            textExtra.append("Номер телефона 80$phone")
            textExtra.append("\n")
            val foodExtra = "$titleExtra + $numberExtra кількість = $sumExtra грн."
            textExtra.append(foodExtra)
            textExtra.append("\n")
        }
        textExtra.append(taxIntent)
        textExtra.append("\n")
        textExtra.append("Загальна сума до сплати становить $fullSum грн.")

        intent.putExtra(Intent.EXTRA_TEXT, textExtra.text)

        context.startActivity(Intent.createChooser(intent, "hsgjbgdlbgdglknglk"))
    }

    private fun getPhone(): String {
        val sharePref = getSharedPreferences("myPhone", MODE_PRIVATE)
        return sharePref.getString("key_phone", "")!!
    }

}

