package com.example.choonpaan.database.repository

import android.annotation.SuppressLint
import android.content.Context
import com.example.choonpaan.database.AppDatabase
import com.example.choonpaan.database.entity.OrderDetail

import java.sql.Timestamp

class OrderDetailRepo(val context: Context) {

    private val db= AppDatabase.getInstance(context)
    private val orderDetailDao=db.orderDetailDao()
    companion object {
        @SuppressLint("StaticFieldLeak")
        @Volatile
        private var INSTANCE: OrderDetailRepo? = null
        fun getInstance(context: Context) =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: OrderDetailRepo(context).also {
                    INSTANCE = it
                }
            }
    }

    fun insert(orderdetail: OrderDetail)=orderDetailDao.insert(orderdetail)

    fun getall() = orderDetailDao.getAll()

    fun getAllById(id:Long) = orderDetailDao.getAllById(id)

}