package com.example.choonpaan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_registration.*


class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)


        val helpbtn:Button=findViewById(R.id.help_button2)
        val signupbtn:Button=findViewById(R.id.signupbtn)
        val cancelbtn:Button=findViewById(R.id.cancelBtn)



        helpbtn.setOnClickListener {
            val intent= Intent(this,ActivityLogin::class.java)
            startActivity(intent)
        }
        signupbtn.setOnClickListener {
            val fname=fnameInput.text.toString()
            val lname=lnameInput.text.toString()
            val email=emailInput.text.toString()
            val phoneno=phoneInput.text.toString()
            val pass=pWInput.text.toString()
            val repass=rEPWInput.text.toString()

            if(fname == "") {
                fnameInput.error="Empty Field !!"
            } else if(lname == "") {
                lnameInput.error="Empty Field !!"
            }else if ( email == ""){
                emailInput.error="Empty Field !!"
            }else if (phoneno == "" ){
                phoneInput.error="Empty Field !!"
            }else if(pass == ""){
                pWInput.error="Empty Field !!"
            }else if (repass == ""){
                rEPWInput.error="Empty Field !!"
            }else{
                Toast.makeText(this, "Registration Sucessfull", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, ActivityLogin::class.java)
                startActivity(intent)
            }
        }
        cancelbtn.setOnClickListener {
            val intent= Intent(this,ActivityLogin::class.java)
            startActivity(intent)
        }

    }
}