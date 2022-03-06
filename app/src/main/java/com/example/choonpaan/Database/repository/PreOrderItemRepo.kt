package com.example.choonpaan.database.repository

import android.annotation.SuppressLint
import android.content.Context
import com.example.choonpaan.database.AppDatabase
import com.example.choonpaan.database.entity.PreOrderItem
import com.example.choonpaan.database.entity.User

class PreOrderItemRepo(val context: Context) {

    private val db= AppDatabase.getInstance(context)
    private val preOrderItemDao=db.preOrderItemDao()
    companion object {
        @SuppressLint("StaticFieldLeak")
        @Volatile
        private var INSTANCE: PreOrderItemRepo? = null
        fun getInstance(context: Context) =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: PreOrderItemRepo(context).also {
                    INSTANCE = it
                }
            }
    }

    fun insert(pre_order_item: PreOrderItem)=preOrderItemDao.insert(pre_order_item)

    fun insertall(vararg dataEntities: PreOrderItem)=preOrderItemDao.insertAll(*dataEntities)

    fun getall() = preOrderItemDao.getAll()

    fun update(pre_order_item: PreOrderItem) = preOrderItemDao.update(pre_order_item)

    fun delete(pre_order_item: PreOrderItem) = preOrderItemDao.delete(pre_order_item)
}