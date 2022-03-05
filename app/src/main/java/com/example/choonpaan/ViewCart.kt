package com.example.choonpaan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast

class ViewCart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_cart)

        val cancelBtn1:CheckBox=findViewById(R.id.cancelButn01)
        val cancelBtn2:CheckBox=findViewById(R.id.cancelButn02)
        val cancelBtn3:CheckBox=findViewById(R.id.cancelButn03)

        cancelBtn1.setOnCheckedChangeListener { checkbox, isChecked ->
            if (isChecked){
                showToast("Item added to favourite")
            }else{
                showToast("Item removed to favourite")
            }
        }
        cancelBtn2.setOnCheckedChangeListener { checkbox, isChecked ->
            if (isChecked){
                showToast("Item added to favourite")
            }else{
                showToast("Item removed to favourite")
            }
        }
        cancelBtn3.setOnCheckedChangeListener { checkbox, isChecked ->
            if (isChecked){
                showToast("Item added to favourite")
            }else{
                showToast("Item removed to favourite")
            }
        }
        }

    private fun showToast(str: String) {
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show()
    }
}