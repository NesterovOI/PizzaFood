package com.nesterov.pizza.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nesterov.pizza.R
import com.nesterov.pizza.adapter.AdapterCategoriesList
import com.nesterov.pizza.bd.ArrayListFood
import com.nesterov.pizza.bd.ManagementFood
import com.nesterov.pizza.data.Food
import com.nesterov.pizza.databinding.ActivityAdditionBinding

class AdditionActivity : AppCompatActivity() {

    lateinit var binding: ActivityAdditionBinding
    lateinit var itemList: ArrayList<Food>
    lateinit var itemAdapter: AdapterCategoriesList

    lateinit var findItemList: ArrayList<Food>

    val arrayListFood = ArrayListFood()
    val managementFood = ManagementFood()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdditionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerViewAddition()

        binding.homeBtn.setOnClickListener{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        }

    }

    fun recyclerViewAddition() = with(binding) {
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(
            this@AdditionActivity, LinearLayoutManager.VERTICAL, false
        )
        itemList = ArrayList()
        findItemList = ArrayList()
        arrayListFood.additionListFood(itemList)

        itemAdapter = AdapterCategoriesList(findItemList)
        recyclerView.adapter = itemAdapter

        managementFood.initFind(findItemList, idFindEdit, recyclerView, itemList)

        itemAdapter.itemClick = {
            val i = Intent(this@AdditionActivity, AdditionActivity::class.java)
            i.putExtra("addition", it)
            startActivity(i)
        }

        val onClick = intent.getParcelableExtra<Food>("addition")

        if (onClick != null) {
            if (onClick.image == R.drawable.addition1) {
                managementFood.intentItemList(this@AdditionActivity, 0, itemList)
            } else
                if (onClick.image == R.drawable.addition2) {
                    managementFood.intentItemList(this@AdditionActivity, 1, itemList)
                } else
                    if (onClick.image == R.drawable.addition3) {
                        managementFood.intentItemList(this@AdditionActivity, 2, itemList)
                    } else
                        if (onClick.image == R.drawable.addition4) {
                            managementFood.intentItemList(this@AdditionActivity, 3, itemList)
                        } else
                            if (onClick.image == R.drawable.addition5) {
                                managementFood.intentItemList(this@AdditionActivity, 4, itemList)
                            } else
                                if (onClick.image == R.drawable.addition6) {
                                    managementFood.intentItemList(
                                        this@AdditionActivity,
                                        5,
                                        itemList
                                    )
                                } else
                                    if (onClick.image == R.drawable.addition7) {
                                        managementFood.intentItemList(
                                            this@AdditionActivity,
                                            6,
                                            itemList
                                        )
                                    }
        }
    }
}