package com.example.choonpaan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity_Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val backbutton1: Button =findViewById<Button>(R.id.backButton2)
        val forgotButton: Button =findViewById<Button>(R.id.forgotPwButton)

        backbutton1.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        forgotButton.setOnClickListener {
            val intent= Intent(this,ForgetPassword::class.java)
            startActivity(intent)
        }
    }
}