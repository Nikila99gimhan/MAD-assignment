package com.example.choonpaan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_payment_form.*
import kotlinx.android.synthetic.main.activity_registration.*

class PaymentForm : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_form)


        button8.setOnClickListener {
            val intent= Intent(this,Payment::class.java)
            startActivity(intent)
        }
        payBtn.setOnClickListener {
            val bname=bankNameInput.text.toString()
            val cnumber=cardNumberInput.text.toString()
            val cname=customerNameInput.text.toString()
            val edate=expiryDate.text.toString()
            val cvv=cvv.text.toString()
            if(bname == "") {
                fnameInput.error="Empty Field !!"
            } else if(cnumber == "") {
                lnameInput.error="Empty Field !!"
            }else if ( cname == ""){
                emailInput.error="Empty Field !!"
            }else if (edate == "" ){
                phoneInput.error="Empty Field !!"
            }else if(cvv == ""){
                pWInput.error="Empty Field !!"
            }else if (!(radioVisa.isChecked) || !(radioMaster.isChecked)){
                Toast.makeText(this, "Please select the card type!!", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Registration Sucessfull", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, ActivityLogin::class.java)
                startActivity(intent)
            }
        }
        val cancel:Button=findViewById(R.id.cancelBtnPay)
        cancel.setOnClickListener {
            val intent = Intent(this, ActivityLogin::class.java)
            startActivity(intent)
        }

    }
}