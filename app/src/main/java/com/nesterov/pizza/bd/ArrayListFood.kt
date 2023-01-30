package com.nesterov.pizza.bd

import com.nesterov.pizza.R
import com.nesterov.pizza.data.Categories
import com.nesterov.pizza.data.Food

class ArrayListFood {

    fun categoriesListFood(itemList: ArrayList<Categories>){
        itemList.add(Categories(R.drawable.cat_1, R.drawable.category_backgrount, "Піца"))
        itemList.add(Categories(R.drawable.cat_2, R.drawable.category_backgrount2, "Роли"))
        itemList.add(Categories(R.drawable.cat_3, R.drawable.category_backgrount3, "Сети"))
        itemList.add(Categories(R.drawable.cat_4, R.drawable.category_backgrount4, "Салат"))
        itemList.add(Categories(R.drawable.cat_5, R.drawable.category_backgrount5, "Суп"))
        itemList.add(Categories(R.drawable.cat_6, R.drawable.category_backgrount6, "Соус"))
        itemList.add(Categories(R.drawable.cat_7, R.drawable.category_backgrount7, "Десерт"))
        itemList.add(Categories(R.drawable.cat_8, R.drawable.category_backgrount8, "Напій"))
    }

    fun popularListFood(itemList: ArrayList<Food>){
        itemList.add(Food(R.drawable.pop_1, "Піца 4 м\'яса — 450 г", R.string.dessert1_description, 199.00))
        itemList.add(Food(R.drawable.cat_2, "Авокадо ролл — 210 г 8 шт", R.string.dessert2_description, 210.00))
        itemList.add(Food(R.drawable.pop_3, "Піца 4 сира — 440 г", R.string.dessert3_description, 180.00))
        itemList.add(Food(R.drawable.cat_4, "Курячі стріпси — 140 г", R.string.salad11_description, 150.00)
        )
    }

    fun pizzaListFood(itemList: ArrayList<Food>){
        itemList.add(Food(R.drawable.pizza1, "Піца 4 м\'яса — 450 г", R.string.pizza1_description, 195.00))
        itemList.add(Food(R.drawable.pizza2, "Піца 4 сезони — 470 г", R.string.pizza2_description, 185.00))
        itemList.add(Food(R.drawable.pizza3, "Піца 4 сира — 440 г", R.string.pizza3_description, 190.00))
        itemList.add(Food(R.drawable.pizza4, "Піца Асорті — 500 г", R.string.pizza4_description, 190.00))
        itemList.add(Food(R.drawable.pizza5, "Піца Гавайська — 480 г", R.string.pizza5_description, 190.00))
        itemList.add(Food(R.drawable.pizza6, "Піца дитяча — 470 г", R.string.pizza6_description, 190.00))
        itemList.add(Food(R.drawable.pizza7, "Піца з куркою та грибами — 450 г", R.string.pizza7_description, 190.00))
        itemList.add(Food(R.drawable.pizza8, "Піца курка та сир — 420 г", R.string.pizza8_description, 190.00))
        itemList.add(Food(R.drawable.pizza9, "Піца куряча — 410 г", R.string.pizza9_description, 190.00))
        itemList.add(Food(R.drawable.pizza10, "Піца маргарита — 350 г", R.string.pizza10_description, 190.00))
        itemList.add(Food(R.drawable.pizza11, "Піца мисливська — 450 г", R.string.pizza11_description, 190.00))
        itemList.add(Food(R.drawable.pizza12, "Піца пепероні — 450 г", R.string.pizza12_description, 190.00))
        itemList.add(Food(R.drawable.pizza13, "Піца шинка пепероні — 450 г", R.string.pizza13_description, 190.00))
    }

    fun additionListFood(itemList: ArrayList<Food>){
        itemList.add(Food(R.drawable.addition1, "Авокадо доповнення — 25 г", R.string.addition1_description, 15.00))
        itemList.add(Food(R.drawable.addition2, "Васабі — 5 г", R.string.addition2_description, 15.00))
        itemList.add(Food(R.drawable.addition3, "Імбір — 7 г", R.string.addition3_description, 15.00))
        itemList.add(Food(R.drawable.addition4, "Сир філадельфія доповнення — 20 г", R.string.addition1_description, 15.00))
        itemList.add(Food(R.drawable.addition5, "Соєвий соус доповнення — 40 г", R.string.addition1_description, 15.00))
        itemList.add(Food(R.drawable.addition6, "Соус горіховий доповнення — 30 г", R.string.addition1_description, 15.00))
        itemList.add(Food(R.drawable.addition7, "Соус унагі доповнення — 20 г", R.string.addition1_description, 15.00))
    }

    fun dessertListFood(itemList: ArrayList<Food>){
        itemList.add(Food(R.drawable.dessert1, "Моті банан шоколад", R.string.dessert1_description, 120.00))
        itemList.add(Food(R.drawable.dessert2, "Моті гранат з медом — 42 г", R.string.dessert2_description, 120.00))
        itemList.add(Food(R.drawable.dessert3, "Моті маракуя — 42 г", R.string.dessert3_description, 120.00))
    }

    fun drinksListFood(itemList: ArrayList<Food>){
        itemList.add(Food(R.drawable.drinks1, "Бонаква", R.string.drinks1_description, 25.00))
        itemList.add(Food(R.drawable.drinks2, "Бонаква газована", R.string.drinks2_description, 25.00))
        itemList.add(Food(R.drawable.drinks3, "Кола 0,5", R.string.drinks3_description, 25.00))
        itemList.add(Food(R.drawable.drinks4, "Лимонад імбірний", R.string.drinks4_description, 30.00))
        itemList.add(Food(R.drawable.drinks5, "Морс ягідний", R.string.drinks5_description, 30.00))
    }

    fun networksListFood(itemList: ArrayList<Food>){
        itemList.add(Food(R.drawable.networks1, "Сет мій смачний — 1235 г", R.string.networks1_description, 500.00))
        itemList.add(Food(R.drawable.networks2, "Сет моя осіння казка — 1020 г", R.string.networks2_description, 500.00))
        itemList.add(Food(R.drawable.networks3, "Сет Свято наближається — 1015 г", R.string.networks3_description, 500.00))
        itemList.add(Food(R.drawable.networks4, "Сет Сімейний — 2000 г", R.string.networks4_description, 500.00))
        itemList.add(Food(R.drawable.networks5, "Сет Добрий вечір — 1005 г", R.string.networks5_description, 500.00))
        itemList.add(Food(R.drawable.networks6, "Сет Мій Кривбас — 970 г", R.string.networks6_description, 500.00))
        itemList.add(Food(R.drawable.networks7, "Сет Панночка — 1010 г", R.string.networks7_description, 500.00))
        itemList.add(Food(R.drawable.networks8, "Сет Різдвяний — 1010 г", R.string.networks8_description, 500.00))
        itemList.add(Food(R.drawable.networks9, "Сет Шалена пятница/я — 1180 г", R.string.networks9_description, 500.00))
        itemList.add(Food(R.drawable.networks10, "Біг сет — 1925 г", R.string.networks10_description, 500.00))
        itemList.add(Food(R.drawable.networks11, "Сет Бінго — 805 г", R.string.networks11_description, 500.00))
        itemList.add(Food(R.drawable.networks12, "Сет Гаряча штучка — 1200 г", R.string.networks12_description, 500.00))
        itemList.add(Food(R.drawable.networks13, "Сет Джумаджі — 1095 г", R.string.networks13_description, 500.00))
        itemList.add(Food(R.drawable.networks14, "Сет Мій байрактар — 885 г", R.string.networks14_description, 500.00))
        itemList.add(Food(R.drawable.networks15, "Сет Мій Біг Бен — 2000 г", R.string.networks15_description, 500.00))
        itemList.add(Food(R.drawable.networks16, "Сет Мій вечір — 1290 г", R.string.networks16_description, 500.00))
        itemList.add(Food(R.drawable.networks17, "Сет Мій ввідпочинок — 830 г", R.string.networks17_description, 500.00))
        itemList.add(Food(R.drawable.networks18, "Сет Мій Джет — 1160 г", R.string.networks18_description, 500.00))
        itemList.add(Food(R.drawable.networks19, "Сет Мій Каприз — 695 г", R.string.networks19_description, 500.00))
        itemList.add(Food(R.drawable.networks20, "Сет Мій Рокн Рол — 810 г", R.string.networks20_description, 500.00))
        itemList.add(Food(R.drawable.networks21, "Сет Мій фаворит — 1990 г", R.string.networks21_description, 500.00))
        itemList.add(Food(R.drawable.networks22, "Сет Мій хіт — 885 г", R.string.networks22_description, 500.00))
        itemList.add(Food(R.drawable.networks23, "Сет Мій яскравий — 1055 г", R.string.networks23_description, 500.00))
        itemList.add(Food(R.drawable.networks24, "Сет Моє бажання — 1065 г", R.string.networks24_description, 500.00))
    }

    fun rolesListFood(itemList: ArrayList<Food>){
        itemList.add(Food(R.drawable.roles1, "Авокадо ролл — 210 г 8 шт", R.string.roles1_description, 300.00))
        itemList.add(Food(R.drawable.roles2, "Боніто з вугрем — 190 г 8 шт", R.string.roles2_description, 300.00))
        itemList.add(Food(R.drawable.roles3, "Боніто з лососем — 190 г 8 шт", R.string.roles3_description, 300.00))
        itemList.add(Food(R.drawable.roles4, "Калафорнія з вугрем в ікрі — 200 г 8 шт", R.string.roles4_description, 300.00))
        itemList.add(Food(R.drawable.roles5, "Калафорнія з вугрем в кунжуті — 195 г 8 шт", R.string.roles5_description, 300.00))
        itemList.add(Food(R.drawable.roles6, "Калафорнія з крабом в ікрі — 195 г 8 шт", R.string.roles6_description, 300.00))
        itemList.add(Food(R.drawable.roles7, "Калафорнія з крабом в кунжуті — 190 г 8 шт", R.string.roles7_description, 300.00))
        itemList.add(Food(R.drawable.roles8, "Калафорнія з лососем в ікрі — 195 г 8 шт", R.string.roles8_description, 300.00))
        itemList.add(Food(R.drawable.roles9, "Калафорнія з лососем в кунжуті — 190 г 8 шт", R.string.roles9_description, 300.00))
        itemList.add(Food(R.drawable.roles10, "Калафорнія з лососем в кунжуті — 190 г 8 шт", R.string.roles10_description, 300.00))
        itemList.add(Food(R.drawable.roles11, "Калафорнія з тунцем в кунжуті — 190 г 8 шт", R.string.roles11_description, 300.00))
        itemList.add(Food(R.drawable.roles12, "Калафорнія Хіяші — 195 г 8 шт", R.string.roles12_description, 300.00))
        itemList.add(Food(R.drawable.roles13, "Креветка мікс — 195 г 8 шт", R.string.roles13_description, 300.00))
        itemList.add(Food(R.drawable.roles14, "Макі вугор — 100 г 8 шт", R.string.roles14_description, 300.00))
        itemList.add(Food(R.drawable.roles15, "Макі краб — 100 г 8 шт", R.string.roles15_description, 300.00))
        itemList.add(Food(R.drawable.roles16, "Макі креветка — 100 г 8 шт", R.string.roles16_description, 300.00))
        itemList.add(Food(R.drawable.roles17, "Макі лосось — 100 г 8 шт", R.string.roles17_description, 300.00))
        itemList.add(Food(R.drawable.roles18, "Макі огірок — 100 г 8 шт", R.string.roles18_description, 300.00))
        itemList.add(Food(R.drawable.roles19, "Макі тунець — 100 г 8 шт", R.string.roles19_description, 300.00))
        itemList.add(Food(R.drawable.roles20, "Фелікс рол — 180 г 6 шт", R.string.roles20_description, 300.00))
        itemList.add(Food(R.drawable.roles21, "Філадельфія Гурман — 260 г 8 шт", R.string.roles21_description, 300.00))
        itemList.add(Food(R.drawable.roles22, "Філадельфія де люкс — 215 г 8 шт", R.string.roles22_description, 300.00))
        itemList.add(Food(R.drawable.roles23, "Філадельфія з вугрем — 205 г 8 шт", R.string.roles23_description, 300.00))
    }

    fun saladListFood(itemList: ArrayList<Food>){
        itemList.add(Food(R.drawable.salad1, "Курячі стріпси — 140 г", R.string.salad1_description, 120.00))
        itemList.add(Food(R.drawable.salad2, "Моцарелла фрі — 150 г", R.string.salad2_description, 120.00))
        itemList.add(Food(R.drawable.salad3, "Рис з креветкою — 300 г", R.string.salad3_description, 120.00))
        itemList.add(Food(R.drawable.salad4, "Рис з куркою — 300 г", R.string.salad4_description, 120.00))
        itemList.add(Food(R.drawable.salad5, "Рисова локшина з куркою — 260 г", R.string.salad5_description, 120.00))
        itemList.add(Food(R.drawable.salad6, "Рисова локшина з море продуктами — 300 г", R.string.salad6_description, 120.00))
        itemList.add(Food(R.drawable.salad7, "Рисова локшина з овочами — 250 г", R.string.salad7_description, 120.00))
        itemList.add(Food(R.drawable.salad8, "Рисова локшина з телятиною — 260 г", R.string.salad8_description, 120.00))
        itemList.add(Food(R.drawable.salad9, "Рисові чіпси — 50 г", R.string.salad9_description, 120.00))
        itemList.add(Food(R.drawable.salad10, "Салат з креветкою — 130 г", R.string.salad10_description, 120.00))
        itemList.add(Food(R.drawable.salad11, "Салат тайський — 170 г", R.string.salad11_description, 120.00))
        itemList.add(Food(R.drawable.salad12, "Салат хіяші — 110 г", R.string.salad12_description, 120.00))
        itemList.add(Food(R.drawable.salad13, "Удон з куркою — 270 г", R.string.salad13_description, 120.00))
        itemList.add(Food(R.drawable.salad14, "Удон з морепродуктами — 300 г", R.string.salad14_description, 120.00))
        itemList.add(Food(R.drawable.salad15, "Удон з овочами — 250 г", R.string.salad15_description, 120.00))
        itemList.add(Food(R.drawable.salad16, "Удон з телятиною — 270 г", R.string.salad16_description, 120.00))
    }

    fun soupsListFood(itemList: ArrayList<Food>){
        itemList.add(Food(R.drawable.soups1, "Місо вершковий з лососем — 240 г", R.string.soups1_description, 110.00))
        itemList.add(Food(R.drawable.soups2, "Місо суп — 190 г", R.string.soups2_description, 110.00))
        itemList.add(Food(R.drawable.soups3, "Рамен з куркою — 475 г", R.string.soups3_description, 110.00))
        itemList.add(Food(R.drawable.soups4, "Рамен з телятиною — 475 г", R.string.soups4_description, 110.00))
        itemList.add(Food(R.drawable.soups5, "Суп з морепродуктами — 250 г", R.string.soups5_description, 110.00))
        itemList.add(Food(R.drawable.soups6, "Суп суімоно — 280 г", R.string.soups6_description, 110.00))
        itemList.add(Food(R.drawable.soups7, "Том ям — 400 г", R.string.soups7_description, 110.00))
    }

}