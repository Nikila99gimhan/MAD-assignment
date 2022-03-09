package com.example.choonpaan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.choonpaan.database.repository.UserRepo
import kotlinx.android.synthetic.main.activity_forget_password2.*

class ForgetPassword2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password2)

        val submitBtn: Button = findViewById(R.id.submitBtn02)
        val back: Button = findViewById(R.id.backButton2)

        submitBtn.setOnClickListener {
            val pass = newPassInput.text.toString()
            val repass = reEnterPassInput.text.toString()
            if (pass == null) {
                Toast.makeText(this, "Empty Field!!!", Toast.LENGTH_SHORT).show()
            } else if (repass == null) {
                Toast.makeText(this, "Empty Field!!!", Toast.LENGTH_SHORT).show()
            } else {
                if (pass != repass) {
                    Toast.makeText(this, "Passwords doesn't match!!!", Toast.LENGTH_SHORT).show()
                } else {
                    //val repo = UserRepo.getInstance(this)
                    //repo.update(newPassInput)
                    val intent = Intent(this, ActivityLogin::class.java)
                    startActivity(intent)
                    Toast.makeText(this, "Password Updated!!!", Toast.LENGTH_SHORT).show()
                }
            }

            back.setOnClickListener {
                val intent = Intent(this, ForgetPassword::class.java)
                startActivity(intent)
            }
        }

    }

}


