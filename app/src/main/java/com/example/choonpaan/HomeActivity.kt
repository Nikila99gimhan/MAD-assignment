package com.example.choonpaan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_contact_us.*
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        trackingButton.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
        }
        preorderButton.setOnClickListener {
            val intent = Intent(this, OrderNowActivity::class.java)
            startActivity(intent)
        }
        choonpaanitemsButton.setOnClickListener {
            val intent = Intent(this, ActivityChoonPaan::class.java)
            startActivity(intent)
        }
        ebillButton.setOnClickListener {
            val intent = Intent(this, activity_ebill::class.java)
            startActivity(intent)
        }
        viewcartButton.setOnClickListener {
            val intent = Intent(this, ViewCart::class.java)
            startActivity(intent)
        }
        newarrivalButton.setOnClickListener {
            val intent = Intent(this, activity_new_arrivals::class.java)
            startActivity(intent)
        }
        contactButton.setOnClickListener {
            val intent = Intent(this, ActivityContactUs::class.java)
            startActivity(intent)
        }
        complainButton.setOnClickListener {
            val intent = Intent(this, ActivityComplains::class.java)
            startActivity(intent)
        }
    }
}