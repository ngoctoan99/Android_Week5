package com.example.androidweek5

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.transition.FragmentTransitionSupport
import com.example.androidweek5.data.User
import com.example.androidweek5.databinding.ActivityLoginInBinding.inflate


class ProfileFragment : Fragment() {
    lateinit var preferences : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile2, container, false)
        preferences = activity!!.getSharedPreferences("SAVEAS", Context.MODE_PRIVATE)
        view.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.To_homeScreenFragment)
        }
        val btnsignout = view.findViewById<Button>(R.id.btnout)
        btnsignout.setOnClickListener {
            val editor : SharedPreferences.Editor = preferences.edit()
            editor.clear()
            editor.apply()
            val intent = Intent(activity,Welcome::class.java)
            startActivity(intent)
        }
        return view
    }
}