package com.example.androidweek5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnboardingTwo : AppCompatActivity() {
    private lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_two)
        btn = findViewById(R.id.btntwo)
        btn.setOnClickListener {
            var intent = Intent(this, OnboardingThree::class.java)
            startActivity(intent)
            finish()

        }
    }
}