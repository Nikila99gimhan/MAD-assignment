package com.example.choonpaan

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.choonpaan.database.entity.Payment
import com.example.choonpaan.database.repository.PaymentRepo
import kotlinx.android.synthetic.main.activity_payment_form.*

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
            val type=radioGroup2
            val edate=expiryDate.text.toString()
            val cvv=cvvInput.text.toString()
            if(bname == "") {
                bankNameInput.error="Empty Field !!"
            } else if(cnumber == "") {
                cardNumberInput.error="Empty Field !!"
            }else if ( cname == ""){
                customerNameInput.error="Empty Field !!"
            }else if (edate == "" ){
                expiryDate.error="Empty Field !!"
            }else if(cvv == ""){
                cvvInput.error="Empty Field !!"
            }else if (!(radioVisa.isChecked) || !(radioMaster.isChecked)){
                Toast.makeText(this, "Please select the card type!!", Toast.LENGTH_SHORT).show()
            }else{
                val repo = PaymentRepo.getInstance(this)
                val payment = Payment(
                    null,bname,type.toString(),cnumber,cname,edate,cvv,true,false
                )
                repo.insert(payment)
                Toast.makeText(this, "Payment Completed", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Payment::class.java)
                startActivity(intent)
            }
        }

        cancelBtnPay.setOnClickListener {
            val intent = Intent(this, ActivityLogin::class.java)
            startActivity(intent)
        }

    }
}