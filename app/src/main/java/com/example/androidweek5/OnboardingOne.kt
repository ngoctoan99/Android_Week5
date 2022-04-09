package com.example.androidweek5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnboardingOne : AppCompatActivity() {
    private lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_one)
        btn = findViewById(R.id.btnone)
        btn.setOnClickListener {
            var intent = Intent(this,OnboardingTwo :: class.java)
            startActivity(intent)
            finish()
        }
    }
}
