package com.example.lv3

import com.example.lv3.model.food


object FoodData {

    private val foodName = arrayOf(
        "Ayam Bakar",
        "Ayam Goreng",
        "Cap Jay",
        "Fuyunghai",
        "Mie Goreng",
        "Mie Rebus",
        "Nasi Goreng",
        "Rawon",
        "Seblak",
        "Soto")

    private val detail = arrayOf(
        "Ayam Bakar adalah Makanan Khas Indonesia",
        "Ayam Goreng adalah Makanan Khas dari Indonesia",
        "Cap Jay adalah Makanan Khas dari China",
        "Fuyunghai adalah Makanan Khas dari Tiongkok",
        "Mie Goreng adalah Masakan Khas dari Anak Kos",
        "Mie Rebus adalah Masakan Khas dari Anak Kos",
        "Nasi Goreng adalah Masakan Khas dari Indonesia",
        "Rawon adalah Masakan Khas dari Jawa Timur",
        "Seblak adalah Makanan Khas dari Jawa Barat",
        "Soto adalah Makanan Khas dari Lamongan"
    )

    private val Foodposter = intArrayOf(
        R.drawable.ab,
        R.drawable.ag,
        R.drawable.cj,
        R.drawable.fuyung,
        R.drawable.mg,
        R.drawable.mr,
        R.drawable.ns,
        R.drawable.rawon,
        R.drawable.seblak,
        R.drawable.soto
    )

    val listFood:ArrayList<food>
        get() {
          val list = arrayListOf<food>()
            for (position in foodName.indices){
                val Food = food()
                Food.name = foodName[position]
                Food.detail = detail[position]
                Food.poster = Foodposter[position]
                list.add(Food)

            }

            return list
        }
}