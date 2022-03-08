package com.example.choonpaan.database.repository

import android.annotation.SuppressLint
import android.content.Context
import com.example.choonpaan.database.AppDatabase
import com.example.choonpaan.database.entity.Payment

class PaymentRepo(val context: Context) {

    private val db= AppDatabase.getInstance(context)
    private val paymentDao=db.paymentDao()
    companion object {
        @SuppressLint("StaticFieldLeak")
        @Volatile
        private var INSTANCE: PaymentRepo? = null
        fun getInstance(context: Context) =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: PaymentRepo(context).also {
                    INSTANCE = it
                }
            }
    }

    fun insert(payment: Payment)= paymentDao.insert(payment)
    fun insertall(vararg dataEntities: Payment)=paymentDao.insertAll(*dataEntities)

    fun getall() = paymentDao.getAll()

    fun update(payment: Payment) = paymentDao.update(payment)

    fun delete(payment: Payment) = paymentDao.delete(payment)

}