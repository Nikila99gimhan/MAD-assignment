package com.example.choonpaan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginbtn: Button =findViewById(R.id.buttonLogin)
        val signupbtn:Button=findViewById(R.id.signUpButton)

        loginbtn.setOnClickListener {
            val intent= Intent(this,Activity_Login::class.java)
            startActivity(intent)
        }
        signupbtn.setOnClickListener {
            val intent= Intent(this,RegistrationActivity::class.java)
            startActivity(intent)
        }
    }
}