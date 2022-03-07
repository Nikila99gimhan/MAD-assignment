package com.example.choonpaan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activity_choonPaan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choon_paan)
        val backbutton: Button = findViewById<Button>(R.id.backbuttoncpi)

        backbutton.setOnClickListener {
            val intent = Intent(this, Activity_Login::class.java)
            startActivity(intent)
        }
    }
}