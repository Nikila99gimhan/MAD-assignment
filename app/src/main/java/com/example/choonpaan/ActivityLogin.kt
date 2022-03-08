package com.example.choonpaan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.choonpaan.database.entity.User
import com.example.choonpaan.database.repository.UserRepo

import kotlinx.android.synthetic.main.activity_login.*

class ActivityLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

//        val backbutton1: Button = findViewById(R.id.cancelButton)
//        val forgotButton: Button = findViewById(R.id.forgotPwButton)
//        val signbtn: Button = findViewById(R.id.signInLpageButton)
//        val login: Button = findViewById(R.id.loginPageButton)
//        val emailInput:EditText=findViewById(R.id.userNameInputText)
//        val pwInput:EditText=findViewById(R.id.TextPassword)


        cancelButton.setOnClickListener {
            val intent = Intent(this, Payment::class.java)
            startActivity(intent)
        }

        forgotPwButton.setOnClickListener {
            val intent = Intent(this, ForgetPassword::class.java)
            startActivity(intent)
        }

        signInLpageButton.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        }
        loginPageButton.setOnClickListener {
            val email = userNameInputText.text.toString()
            val pw = TextPassword.text.toString()

            if (email == "") {
                userNameInputText.error = "Enter your email"
            } else if (pw == "") {
                TextPassword.error = "Enter your password"
            } else {
                val repo = UserRepo.getInstance(this)
                var user: User? = repo.getUserByEmail(email)

                if (user == null) {
                    Toast.makeText(this,"User not available",Toast.LENGTH_SHORT).show()
                } else {
                    if (pw.equals(user.password)) {
                        val intent = Intent(this, MainActivity::class.java)
                        Toast.makeText(this,"Sucessfully Logged in",Toast.LENGTH_SHORT).show()
                        startActivity(intent)
                    } else {
                        Toast.makeText(this,"Incorrect Password",Toast.LENGTH_SHORT).show()
                    }

                }
            }
        }
    }
}