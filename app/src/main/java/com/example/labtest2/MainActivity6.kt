package com.example.labtest2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity6 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val text = findViewById<TextView>(R.id.signupText)
        text.setOnClickListener {
            val Intent = Intent(this, MainActivity5::class.java)
            startActivity(Intent)
        }
        val btn = findViewById<Button>(R.id.btn8)
        btn.setOnClickListener {
            val Intent = Intent(this, MainActivity7::class.java)
            startActivity(Intent)
        }
    }
}