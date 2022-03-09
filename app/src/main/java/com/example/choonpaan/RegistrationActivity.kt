package com.example.choonpaan

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.choonpaan.database.entity.User
import com.example.choonpaan.database.repository.UserRepo
import kotlinx.android.synthetic.main.activity_registration.*


class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)



        help_button2.setOnClickListener {
            val intent= Intent(this,ActivityLogin::class.java)
            startActivity(intent)
        }
        signupbtn.setOnClickListener {
            val fname=fnameInput.text.toString()
            val lname=lnameInput.text.toString()
            val email=emailInput.text.toString()
            val phoneno=phoneInput.text.toString()
            val address=editTextTextPostalAddress.text.toString()
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
            }else if (address == ""){
                editTextTextPostalAddress.error="Empty Field !!"
            }else if(pass == ""){
                pWInput.error="Empty Field !!"
            }else if (repass == ""){
                rEPWInput.error="Empty Field !!"
            }else if (!(conditionCheckBox.isChecked)){
                Toast.makeText(this, "Tick the check box!!", Toast.LENGTH_SHORT).show()
            }else if (pass != repass){
                Toast.makeText(this, "Passwords are not matching!!", Toast.LENGTH_SHORT).show()
            } else {
                var repo = UserRepo.getInstance(this)
                var user = User(
                    null, fname, lname, "", email, phoneno, address, pass,
                    true, false
                )
                repo.insert(user)

                Toast.makeText(this, "Registration Sucessfull", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, ActivityLogin::class.java)
                startActivity(intent)
            }
        }
        cancelBtnPay.setOnClickListener {
            val intent= Intent(this,ActivityLogin::class.java)
            startActivity(intent)
        }

    }
}