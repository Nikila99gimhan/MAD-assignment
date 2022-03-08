package com.example.choonpaan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ForgetPassword2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password2)

        val submitBtn:Button=findViewById(R.id.submitBtn02)
        val back:Button=findViewById(R.id.backButton2)

        submitBtn.setOnClickListener {
            val intent = Intent(this, ActivityLogin::class.java)
            startActivity(intent)
            Toast.makeText(this,"Password Updated!!!", Toast.LENGTH_SHORT).show()
        }

        back.setOnClickListener {
            val intent = Intent(this, ForgetPassword::class.java)
            startActivity(intent)
        }
    }

}