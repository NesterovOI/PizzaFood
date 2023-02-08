package com.nesterov.pizza.activity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CartListViewModel: ViewModel() {

    private val resultLiveMutable = MutableLiveData<String>()
    val resultLive: LiveData<String> = resultLiveMutable

    fun saveFullSum(money: Double, tax: Int) {
        resultLiveMutable.value = (money + tax).toString()
    }

    fun saveFullMinusSum(money: Double, tax: Int) {
        resultLiveMutable.value = (money - tax).toString()
    }
}