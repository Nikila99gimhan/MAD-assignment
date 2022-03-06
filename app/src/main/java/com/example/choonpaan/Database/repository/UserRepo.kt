package com.onepos.posandroidv2.database.repository

import android.annotation.SuppressLint
import android.content.Context
import com.example.choonpaan.database.AppDatabase
import com.example.choonpaan.database.entity.User

class UserRepo(val context: Context) {

    private val db= AppDatabase.getInstance(context)
    private val userDao=db.userDao()
    companion object {
        @SuppressLint("StaticFieldLeak")
        @Volatile
        private var INSTANCE: UserRepo? = null
        fun getInstance(context: Context) =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: UserRepo(context).also {
                    INSTANCE = it
                }
            }
    }

    fun insert(user: User)=userDao.insert(user)

    fun insertall(vararg dataEntities: User)=userDao.insertAll(*dataEntities)

    fun getall() = userDao.getAll()

    fun update(user: User) = userDao.update(user)

    fun delete(user: User) = userDao.delete(user)
}