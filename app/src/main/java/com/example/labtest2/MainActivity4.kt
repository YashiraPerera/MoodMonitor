package com.example.labtest2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val btn1 = findViewById<Button>(R.id.btn6)
        btn1.setOnClickListener {
            val Intent = Intent(this, MainActivity5::class.java)
            startActivity(Intent)
        }
    }
}