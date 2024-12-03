package com.example.labtest2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11)

        val imgReport = findViewById<ImageView>(R.id.imgReport)
        imgReport.setOnClickListener {
            val Intent = Intent(this, MainActivity10::class.java)
            startActivity(Intent)
        }
        val imgHome = findViewById<ImageView>(R.id.imgHome)
        imgHome.setOnClickListener {
            val Intent = Intent(this, MainActivity7::class.java)
            startActivity(Intent)
        }
        val imgPlus = findViewById<ImageView>(R.id.imgPlus)
        imgPlus.setOnClickListener {
            val Intent = Intent(this, MainActivity8::class.java)
            startActivity(Intent)
        }
        val imgProfile = findViewById<ImageView>(R.id.imgProfile)
        imgProfile.setOnClickListener {
            val Intent = Intent(this, MainActivity12::class.java)
            startActivity(Intent)
        }
    }
}