package com.example.androidweek5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RestaurantAdapter(var dataSet: List<Restaurant>): RecyclerView.Adapter<RestaurantAdapter.ResViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_restaurant, parent,false)
        return ResViewHolder(view)
    }

    override fun onBindViewHolder(holder: ResViewHolder, position: Int) {
        val res = dataSet[position]
        holder.bindData(res)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
    class ResViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindData(restaurant : Restaurant){
            val name = itemView.findViewById<TextView>(R.id.tv_name)
            val address = itemView.findViewById<TextView>(R.id.tv_address)
            val image = itemView.findViewById<ImageView>(R.id.imageRes)
            name.text = restaurant.name
            address.text = restaurant.address
            Glide.with(this.itemView).load(restaurant.image).into(image)

        }
    }
}