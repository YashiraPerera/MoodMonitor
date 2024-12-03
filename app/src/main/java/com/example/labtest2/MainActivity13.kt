package com.example.labtest2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main13)

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
        val imgVideo = findViewById<ImageView>(R.id.imgVideo)
        imgVideo.setOnClickListener {
            val Intent = Intent(this, MainActivity11::class.java)
            startActivity(Intent)
        }
        val imgProfile = findViewById<ImageView>(R.id.imgProfile)
        imgProfile.setOnClickListener {
            val Intent = Intent(this, MainActivity12::class.java)
            startActivity(Intent)
        }

    }
}