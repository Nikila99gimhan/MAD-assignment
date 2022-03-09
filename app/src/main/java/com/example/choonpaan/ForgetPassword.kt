package com.example.choonpaan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.choonpaan.database.repository.UserRepo
import kotlinx.android.synthetic.main.activity_forget_password.*
import kotlinx.android.synthetic.main.activity_login.*

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
            val email = emailInputText.text.toString()
            if (email == "") {
                userNameInputText.error = "Enter your email"
            }else {
                val repo = UserRepo.getInstance(this)
                val user_data = repo.getUserByEmail(email)

                if (user_data != null){
                    ActivityLogin.user =user_data
                }
                if (user_data == null) {
                    Toast.makeText(this, "User not available", Toast.LENGTH_SHORT).show()
                } else {
                    val intent = Intent(this, ForgetPassword2Activity::class.java)
                    startActivity(intent)
                }
            }

        }
    }
}