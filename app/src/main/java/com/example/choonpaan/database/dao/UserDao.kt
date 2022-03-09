package com.example.choonpaan.database.dao

import android.widget.EditText
import androidx.room.*
import com.example.choonpaan.database.entity.User


@Dao
interface UserDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(user: User)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg dataEntities: User)

    @Query("SELECT * FROM user WHERE is_delete=0 and is_active=1 ")
    fun getAll():List<User>?

    @Query("SELECT * FROM user WHERE email=:email and is_delete=0 and is_active=1")
    fun getUserByEmail(email:String): User?

    @Query("SELECT * FROM user WHERE password=:email and is_delete=0 and is_active=1")
    fun getPassword(email:String): User?

    @Delete
    fun delete(user: User)

    @Update
    fun update(user: User)
}