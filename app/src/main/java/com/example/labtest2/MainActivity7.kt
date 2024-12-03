package com.example.labtest2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity7 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        val img = findViewById<ImageView>(R.id.testImg)
        img.setOnClickListener {
            val Intent = Intent(this, MainActivity8::class.java)
            startActivity(Intent)
        }
        val text = findViewById<TextView>(R.id.test)
        text.setOnClickListener {
            val Intent = Intent(this, MainActivity8::class.java)
            startActivity(Intent)
        }
        val imgPlus = findViewById<ImageView>(R.id.imgPlus)
        imgPlus.setOnClickListener {
            val Intent = Intent(this, MainActivity8::class.java)
            startActivity(Intent)
        }

        val img2 = findViewById<ImageView>(R.id.reportImg)
        img2.setOnClickListener {
            val Intent = Intent(this, MainActivity10::class.java)
            startActivity(Intent)
        }

        val text2 = findViewById<TextView>(R.id.report)
        text2.setOnClickListener {
            val Intent = Intent(this, MainActivity10::class.java)
            startActivity(Intent)
        }

        val img3 = findViewById<ImageView>(R.id.videoImg)
        img3.setOnClickListener {
            val Intent = Intent(this, MainActivity11::class.java)
            startActivity(Intent)
        }
        val text3 = findViewById<TextView>(R.id.videos)
        text3.setOnClickListener {
            val Intent = Intent(this, MainActivity11::class.java)
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

        val imgProf = findViewById<ImageView>(R.id.profImg)
        imgProf.setOnClickListener {
            val Intent = Intent(this, MainActivity13::class.java)
            startActivity(Intent)
        }
    }
}