package com.example.choonpaan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ForgetPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)

        val backbutton: Button = findViewById(R.id.backButton2)
        val submit:Button=findViewById(R.id.submitButton)

        backbutton.setOnClickListener {
            val intent = Intent(this, ActivityLogin::class.java)
            startActivity(intent)
        }

        submit.setOnClickListener {
            val intent = Intent(this, ForgetPassword2Activity::class.java)
            startActivity(intent)
        }
    }
}