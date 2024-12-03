package com.example.labtest2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val btn = findViewById<Button>(R.id.btn4)
        btn.setOnClickListener {
            val Intent = Intent(this, MainActivity4::class.java)
            startActivity(Intent)
        }
        val btn1 = findViewById<Button>(R.id.btn5)
        btn1.setOnClickListener {
            val Intent = Intent(this, MainActivity5::class.java)
            startActivity(Intent)
        }
    }
}