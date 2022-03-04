package com.example.choonpaan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class Payment_Form : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var list:ListView=findViewById(R.id.dropDownList)
        val bank= arrayOf("Sampth","DFCC","Seylan")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_form)
        val drop=ArrayAdapter(this,android.R.layout.simple_list_item_1,bank)
        list.adapter=drop

        list.setOnItemClickListener(AdapterView.OnItemClickListener{
                adapterView, view, i, l ->
            Toast.makeText(this@Payment_Form,bank[i],Toast.LENGTH_LONG).show()
        })
    }
}