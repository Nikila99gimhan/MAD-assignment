package com.example.choonpaan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Order_Now_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_now)
        val backbutton: Button = findViewById<Button>(R.id.button2)

        backbutton.setOnClickListener {
            val intent = Intent(this, Activity_Login::class.java)
            startActivity(intent)
        }
    }
}