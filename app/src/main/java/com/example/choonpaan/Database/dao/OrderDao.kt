package com.example.choonpaan.database.dao

import androidx.room.*
import com.example.choonpaan.database.entity.Order

@Dao
interface OrderDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(order: Order)

    @Query("SELECT * FROM `order` ")
    fun getAll():List<Order>?

    @Query("SELECT * FROM `order` WHERE id=:id")
    fun getOrderByID(id:Long):Order?

    @Delete
    fun delete(order: Order)
}