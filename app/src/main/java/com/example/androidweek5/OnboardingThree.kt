package com.example.androidweek5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnboardingThree : AppCompatActivity() {
    private lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_three)
        btn = findViewById(R.id.btnthree)
        btn.setOnClickListener {
            var intent = Intent(this,Welcome::class.java)
            startActivity(intent)
            finish()

        }
    }
}