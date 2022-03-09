package com.example.choonpaan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_view_cart.*

class ViewCart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_cart)

        cancelButton.setOnClickListener {
            val intent = Intent(this, OrderNowActivity::class.java)
            startActivity(intent)
        }
        checkoutButton.setOnClickListener {
            val intent = Intent(this, Payment::class.java)
            startActivity(intent)
        }
        backButton3.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        /*if (cancelButn01.isChecked){
                showToast("Item added to favourite")
            }else{
                showToast("Item removed to favourite")
            }

            if (cancelButn02.isChecked){
                showToast("Item added to favourite")
            }else{
                showToast("Item removed to favourite")
            }


            if (cancelButn03.isChecked){
                showToast("Item added to favourite")
            }else{
                showToast("Item removed to favourite")
            }

        }

    private fun showToast(str: String) {
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show()
    }*/
    }
}