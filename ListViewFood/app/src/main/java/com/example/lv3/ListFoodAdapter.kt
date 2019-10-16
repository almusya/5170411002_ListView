package com.example.lv3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.lv3.model.food

class ListFoodAdapter(private val listFood: ArrayList<food>) : RecyclerView.Adapter<ListFoodAdapter.FoodViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val v : View = LayoutInflater.from(parent.context).inflate(R.layout.item_food,parent , false)
        return FoodViewHolder(v)
    }

    override fun getItemCount(): Int {
        return  listFood.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food : food = listFood[position]
        holder.tvNama.text = food.name
        holder.tvDetail.text = food.detail
        Glide.with(holder.itemView.context)
            .load(food.poster)
            .into(holder.tvPoster)
    }

    inner class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var tvNama : TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail : TextView = itemView.findViewById(R.id.tv_item_detail)
        var tvPoster : ImageView = itemView.findViewById(R.id.image_item)
    }

}