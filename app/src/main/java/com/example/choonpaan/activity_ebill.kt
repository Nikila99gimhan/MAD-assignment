package com.example.choonpaan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ebill.*

class activity_ebill : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ebill)
        backbuttonNA.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        preOrderPageButton.setOnClickListener {
            val intent = Intent(this, OrderNowActivity::class.java)
            startActivity(intent)
        }
    }
}