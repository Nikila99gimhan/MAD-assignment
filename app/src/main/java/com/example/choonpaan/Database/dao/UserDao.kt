package com.example.choonpaan.database.dao

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

    @Delete
    fun delete(user: User)

    @Update
    fun update(user: User)
}