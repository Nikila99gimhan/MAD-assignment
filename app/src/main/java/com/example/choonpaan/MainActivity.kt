package com.example.choonpaan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login_button: Button =findViewById<Button>(R.id.buttonLogin)

        login_button.setOnClickListener {
            val intent= Intent(this,Activity_Login::class.java)
            startActivity(intent)
        }
    }
}