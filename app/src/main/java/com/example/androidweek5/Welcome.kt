package com.example.androidweek5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Welcome : AppCompatActivity() {
    private lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        btn = findViewById(R.id.btn3)
        btn.setOnClickListener {
            var intent = Intent(this , LoginIn ::class.java)
            startActivity(intent)
            finish()
        }
    }
}