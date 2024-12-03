package com.example.labtest2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)

        val text = findViewById<TextView>(R.id.all)
        text.setOnClickListener {
            val Intent = Intent(this, MainActivity8::class.java)
            startActivity(Intent)
        }

        val imgHome = findViewById<ImageView>(R.id.imgHome)
        imgHome.setOnClickListener {
            val Intent = Intent(this, MainActivity7::class.java)
            startActivity(Intent)
        }
        val imgVideo = findViewById<ImageView>(R.id.imgVideo)
        imgVideo.setOnClickListener {
            val Intent = Intent(this, MainActivity11::class.java)
            startActivity(Intent)
        }
        val imgReport = findViewById<ImageView>(R.id.imgReport)
        imgReport.setOnClickListener {
            val Intent = Intent(this, MainActivity10::class.java)
            startActivity(Intent)
        }
        val imgProfile = findViewById<ImageView>(R.id.imgProfile)
        imgProfile.setOnClickListener {
            val Intent = Intent(this, MainActivity12::class.java)
            startActivity(Intent)
        }
        val smoke = findViewById<ImageView>(R.id.imageView5)
        smoke.setOnClickListener {
            val Intent = Intent(this, MainActivity14::class.java)
            startActivity(Intent)
        }
    }
}