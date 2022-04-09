package com.example.androidweek5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidweek5.data.RestaurantStore

class HomeScreenFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home_screen2,container,false)
        val data = RestaurantStore.getDataSet()
        val adapter = RestaurantAdapter(data)
        val  ds = view?.findViewById<RecyclerView>(R.id.dsrestaurant)
        val lm = LinearLayoutManager(activity)
        val images = view?.findViewById<CardView>(R.id.cardview_tran)
        images?.setOnClickListener {
            Navigation.findNavController(images).navigate(R.id.To_profileFragment)
        }
        ds?.layoutManager = lm
        ds?.adapter = adapter
        return view
    }
}