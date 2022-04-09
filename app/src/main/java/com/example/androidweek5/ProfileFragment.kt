package com.example.androidweek5

import android.content.Intent
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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile2, container, false)
        view.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.To_homeScreenFragment)
        }
        val btnsignout = view.findViewById<Button>(R.id.btnout)
        btnsignout.setOnClickListener {
            val intent = Intent(activity,Welcome::class.java)
            startActivity(intent)
        }
        return view
    }
}