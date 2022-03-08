package com.example.choonpaan.database.dao

import androidx.room.*
import com.example.choonpaan.database.entity.OrderDetail


@Dao
interface OrderDetailDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(orderdetail:OrderDetail)

    @Query("SELECT * FROM orderdetail ")
    fun getAll():List<OrderDetail>?

    @Query("SELECT * FROM orderdetail WHERE order_id=:id")
    fun getAllById(id:Long):List<OrderDetail>?

    @Delete
    fun delete(orderdetail: OrderDetail)
}