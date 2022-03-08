package com.example.choonpaan

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_choon_paan.*

class ActivityChoonPaan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choon_paan)

        backbuttoncpi.setOnClickListener {
            val intent = Intent(this, ActivityLogin::class.java)
            startActivity(intent)
        }

            if (favCheckBox1.isChecked){
                showToast("Item added to favourite")
            }else{
                showToast("Item removed to favourite")
            }


            if (favCheckBox2.isChecked){
                showToast("Item added to favourite")
            }else{
                showToast("Item removed to favourite")

        }

            if (favCheckBox3.isChecked){
                showToast("Item added to favourite")
            }else{
                showToast("Item removed to favourite")
            }

    }
    private fun showToast(str: String) {
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show()
    }
}