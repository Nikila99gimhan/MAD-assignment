package com.example.choonpaan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_choon_paan.*
import kotlinx.android.synthetic.main.activity_order_now.*

class OrderNowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_now)
        val backbutton: Button = findViewById(R.id.submitButtonComplain)

        backbutton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
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

            if ( cartButn1.isChecked){
                showToast("Item added to cart")
            }else{
                showToast("Item removed to cart")
            }


            if (cartButn2.isChecked){
                showToast("Item added to cart")
            }else{
                showToast("Item removed to cart")
            }

            if (cartButn3.isChecked){
                showToast("Item added to cart")
            }else{
                showToast("Item removed to cart")
            }
    }

    private fun showToast(str: String) {
        Toast.makeText(this,str, Toast.LENGTH_SHORT).show()
    }

}