package com.example.labtest2


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btn = findViewById<Button>(R.id.btn2)
        btn.setOnClickListener {
            val Intent = Intent(this, MainActivity3::class.java)
            startActivity(Intent)
        }
        val btn1 = findViewById<Button>(R.id.btn3)
        btn1.setOnClickListener {
            val Intent = Intent(this, MainActivity5::class.java)
            startActivity(Intent)
        }
    }
}