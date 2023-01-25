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
import com.nesterov.pizza.databinding.ActivityRolesBinding

class RolesActivity : AppCompatActivity() {

    lateinit var binding: ActivityRolesBinding
    lateinit var itemList: ArrayList<Food>
    lateinit var itemAdapter: AdapterCategoriesList

    val arrayListFood = ArrayListFood()
    val managementFood = ManagementFood()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRolesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        rolesRecyclerView()

    }
    fun rolesRecyclerView() = with(binding){

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(
            this@RolesActivity, LinearLayoutManager.VERTICAL, false
        )

        itemList = ArrayList()
        arrayListFood.rolesListFood(itemList)

        itemAdapter.itemClick = {
            val i = Intent(this@RolesActivity, RolesActivity::class.java)
            i.putExtra("Roles", it)
            startActivity(i)
        }

        val onClick = intent.getParcelableExtra<Food>("Roles")
        if (onClick != null){
            if(onClick.image == R.drawable.roles1){
                managementFood.intentItemList(this@RolesActivity, 0, itemList)
            }else if(onClick.image == R.drawable.roles2){
                managementFood.intentItemList(this@RolesActivity, 1, itemList)
            }else if(onClick.image == R.drawable.roles3){
                managementFood.intentItemList(this@RolesActivity, 2, itemList)
            }else if(onClick.image == R.drawable.roles4){
                managementFood.intentItemList(this@RolesActivity, 3, itemList)
            }else if(onClick.image == R.drawable.roles5){
                managementFood.intentItemList(this@RolesActivity, 4, itemList)
            }else if(onClick.image == R.drawable.roles6){
                managementFood.intentItemList(this@RolesActivity, 5, itemList)
            }else if(onClick.image == R.drawable.roles7){
                managementFood.intentItemList(this@RolesActivity, 6, itemList)
            }else if(onClick.image == R.drawable.roles8){
                managementFood.intentItemList(this@RolesActivity, 7, itemList)
            }else if(onClick.image == R.drawable.roles9){
                managementFood.intentItemList(this@RolesActivity, 8, itemList)
            }else if(onClick.image == R.drawable.roles10){
                managementFood.intentItemList(this@RolesActivity, 9, itemList)
            }else if(onClick.image == R.drawable.roles11){
                managementFood.intentItemList(this@RolesActivity, 10, itemList)
            }else if(onClick.image == R.drawable.roles12){
                managementFood.intentItemList(this@RolesActivity, 11, itemList)
            }else if(onClick.image == R.drawable.roles13){
                managementFood.intentItemList(this@RolesActivity, 12, itemList)
            }else if(onClick.image == R.drawable.roles14){
                managementFood.intentItemList(this@RolesActivity, 13, itemList)
            }else if(onClick.image == R.drawable.roles15){
                managementFood.intentItemList(this@RolesActivity, 14, itemList)
            }else if(onClick.image == R.drawable.roles16){
                managementFood.intentItemList(this@RolesActivity, 15, itemList)
            }else if(onClick.image == R.drawable.roles17){
                managementFood.intentItemList(this@RolesActivity, 16, itemList)
            }else if(onClick.image == R.drawable.roles18){
                managementFood.intentItemList(this@RolesActivity, 17, itemList)
            }else if(onClick.image == R.drawable.roles19){
                managementFood.intentItemList(this@RolesActivity, 18, itemList)
            }else if(onClick.image == R.drawable.roles20){
                managementFood.intentItemList(this@RolesActivity, 19, itemList)
            }else if(onClick.image == R.drawable.roles21){
                managementFood.intentItemList(this@RolesActivity, 20, itemList)
            }else if(onClick.image == R.drawable.roles22){
                managementFood.intentItemList(this@RolesActivity, 21, itemList)
            }else if(onClick.image == R.drawable.roles23){
                managementFood.intentItemList(this@RolesActivity, 22, itemList)
            }
        }

    }
}