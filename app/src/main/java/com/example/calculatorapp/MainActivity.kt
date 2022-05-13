package com.example.calculatorapp

import android.content.Intent
import android.icu.util.IslamicCalendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnCalculator: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalculator = findViewById(R.id.btnCalculator)
        btnCalculator.setOnClickListener {
            val intent = Intent(this, calculatorAtivity::class.java)
            startActivity(intent)
        }
    }
}