package com.example.choonpaan.database.repository

import android.annotation.SuppressLint
import android.content.Context
import com.example.choonpaan.database.AppDatabase
import com.example.choonpaan.database.entity.Order

import java.sql.Timestamp

class OrderRepo(val context: Context) {

    private val db= AppDatabase.getInstance(context)
    private val orderDao=db.orderDao()
    companion object {
        @SuppressLint("StaticFieldLeak")
        @Volatile
        private var INSTANCE: OrderRepo? = null
        fun getInstance(context: Context) =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: OrderRepo(context).also {
                    INSTANCE = it
                }
            }
    }

    fun insert(order: Order)=orderDao.insert(order)

    fun getall() = orderDao.getAll()

    fun getOrderById(id:Long) = orderDao.getOrderByID(id)
}