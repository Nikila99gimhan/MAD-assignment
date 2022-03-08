package com.example.choonpaan.database.repository

import android.annotation.SuppressLint
import android.content.Context
import com.example.choonpaan.database.AppDatabase
import com.example.choonpaan.database.entity.Item

class ItemRepo(val context: Context) {

    private val db= AppDatabase.getInstance(context)
    private val itemDao=db.itemDao()
    companion object {
        @SuppressLint("StaticFieldLeak")
        @Volatile
        private var INSTANCE: ItemRepo? = null
        fun getInstance(context: Context) =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: ItemRepo(context).also {
                    INSTANCE = it
                }
            }
    }

    fun insert(item: Item)=itemDao.insert(item)

    fun insertall(vararg dataEntities: Item)=itemDao.insertAll(*dataEntities)

    fun getall() = itemDao.getAll()

    fun update(item: Item) = itemDao.update(item)

    fun delete(item: Item) = itemDao.delete(item)
}