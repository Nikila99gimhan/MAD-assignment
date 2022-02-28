package com.example.choonpaan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)


        val helpbtn:Button=findViewById(R.id.help_button2)
        val signupbtn:Button=findViewById(R.id.signupbtn)
        val cancelbtn:Button=findViewById(R.id.cancelBtn)

        helpbtn.setOnClickListener {
            val intent= Intent(this,Activity_Login::class.java)
            startActivity(intent)
        }
        signupbtn.setOnClickListener {
            val intent= Intent(this,Activity_Login::class.java)
            startActivity(intent)
        }
        cancelbtn.setOnClickListener {
            val intent= Intent(this,Activity_Login::class.java)
            startActivity(intent)
        }
    }
}