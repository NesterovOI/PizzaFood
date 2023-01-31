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
import com.nesterov.pizza.databinding.ActivityNetworksBinding

class NetworksActivity : AppCompatActivity() {

    lateinit var binding: ActivityNetworksBinding
    lateinit var itemList: ArrayList<Food>
    lateinit var findItemList: ArrayList<Food>
    lateinit var itemAdapter: AdapterCategoriesList

    val arrayListFood = ArrayListFood()
    val managementFood = ManagementFood()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNetworksBinding.inflate(layoutInflater)
        setContentView(binding.root)

        networksRecyclerView()

        binding.homeBtn.setOnClickListener{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        }

    }
    fun networksRecyclerView() = with(binding){

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(
            this@NetworksActivity, LinearLayoutManager.VERTICAL, false
        )

        itemList = ArrayList()
        findItemList = ArrayList()
        arrayListFood.networksListFood(itemList)

        itemAdapter = AdapterCategoriesList(findItemList)
        recyclerView.adapter = itemAdapter

        managementFood.initFind(findItemList, idFindEdit, recyclerView, itemList)

        itemAdapter.itemClick = {
            val i = Intent(this@NetworksActivity, NetworksActivity::class.java)
            i.putExtra("Networks", it)
            startActivity(i)
        }

        val onClick = intent.getParcelableExtra<Food>("Networks")
        if (onClick != null){
            if(onClick.image == R.drawable.networks1){
                managementFood.intentItemList(this@NetworksActivity, 0, itemList)
            }else if(onClick.image == R.drawable.networks2){
                managementFood.intentItemList(this@NetworksActivity, 1, itemList)
            }else if(onClick.image == R.drawable.networks3){
                managementFood.intentItemList(this@NetworksActivity, 2, itemList)
            }else if(onClick.image == R.drawable.networks4){
                managementFood.intentItemList(this@NetworksActivity, 3, itemList)
            }else if(onClick.image == R.drawable.networks5){
                managementFood.intentItemList(this@NetworksActivity, 4, itemList)
            }else if(onClick.image == R.drawable.networks6){
                managementFood.intentItemList(this@NetworksActivity, 5, itemList)
            }else if(onClick.image == R.drawable.networks7){
                managementFood.intentItemList(this@NetworksActivity, 6, itemList)
            }else if(onClick.image == R.drawable.networks8){
                managementFood.intentItemList(this@NetworksActivity, 7, itemList)
            }else if(onClick.image == R.drawable.networks9){
                managementFood.intentItemList(this@NetworksActivity, 8, itemList)
            }else if(onClick.image == R.drawable.networks10){
                managementFood.intentItemList(this@NetworksActivity, 9, itemList)
            }else if(onClick.image == R.drawable.networks11){
                managementFood.intentItemList(this@NetworksActivity, 10, itemList)
            }else if(onClick.image == R.drawable.networks12){
                managementFood.intentItemList(this@NetworksActivity, 11, itemList)
            }else if(onClick.image == R.drawable.networks13){
                managementFood.intentItemList(this@NetworksActivity, 12, itemList)
            }else if(onClick.image == R.drawable.networks14){
                managementFood.intentItemList(this@NetworksActivity, 13, itemList)
            }else if(onClick.image == R.drawable.networks15){
                managementFood.intentItemList(this@NetworksActivity, 14, itemList)
            }else if(onClick.image == R.drawable.networks16){
                managementFood.intentItemList(this@NetworksActivity, 15, itemList)
            }else if(onClick.image == R.drawable.networks17){
                managementFood.intentItemList(this@NetworksActivity, 16, itemList)
            }else if(onClick.image == R.drawable.networks18){
                managementFood.intentItemList(this@NetworksActivity, 17, itemList)
            }else if(onClick.image == R.drawable.networks19){
                managementFood.intentItemList(this@NetworksActivity, 18, itemList)
            }else if(onClick.image == R.drawable.networks20){
                managementFood.intentItemList(this@NetworksActivity, 19, itemList)
            }else if(onClick.image == R.drawable.networks21){
                managementFood.intentItemList(this@NetworksActivity, 20, itemList)
            }else if(onClick.image == R.drawable.networks22){
                managementFood.intentItemList(this@NetworksActivity, 21, itemList)
            }else if(onClick.image == R.drawable.networks23){
                managementFood.intentItemList(this@NetworksActivity, 22, itemList)
            }else if(onClick.image == R.drawable.networks24){
                managementFood.intentItemList(this@NetworksActivity, 23, itemList)
            }
        }

    }
}