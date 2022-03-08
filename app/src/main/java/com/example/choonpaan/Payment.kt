package com.example.choonpaan

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.payment.*

class Payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radioGroup: RadioGroup = findViewById(R.id.radioGroup)


        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            var radioButton: RadioButton = findViewById(checkedId)
            if (checkedId == R.id.radioButton1)
                button4.setOnClickListener {
                    val intent = Intent(this, OrderPlaced::class.java)
                    startActivity(intent)
                    Toast.makeText(this, "Order Place... Cash Payment", Toast.LENGTH_SHORT).show()
                } else {
                button4.setOnClickListener {
                    val intent = Intent(this, PaymentForm::class.java)
                    startActivity(intent)
                    Toast.makeText(this, "Card Payment", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}


