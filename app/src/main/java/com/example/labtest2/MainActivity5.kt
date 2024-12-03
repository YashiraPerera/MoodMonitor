package com.example.labtest2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val text = findViewById<TextView>(R.id.logText)
        text.setOnClickListener {
            val Intent = Intent(this, MainActivity6::class.java)
            startActivity(Intent)
        }
        val btn = findViewById<Button>(R.id.btn7)
        btn.setOnClickListener {
            val Intent = Intent(this, MainActivity6::class.java)
            startActivity(Intent)
        }


    }
}