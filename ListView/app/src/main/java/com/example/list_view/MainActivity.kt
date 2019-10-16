package com.example.list_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import android.R.layout.simple_list_item_1
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      /*  val languange = listOf("Kotlin","Python","Ruby","Java Script","PHP")

        list_view.adapter = ArrayAdapter(this, simple_list_item_1 , languange)

        list_view.setOnItemClickListener{parent , view , position , id -> Toast.makeText(this ,
            "Anda Memilih :${languange[position]}",Toast.LENGTH_SHORT).show()}

       */
    }
}
