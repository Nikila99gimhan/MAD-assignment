package com.example.choonpaan.database.dao

import androidx.room.*
import com.example.choonpaan.database.entity.PreOrderItem


@Dao
interface PreOrderItemDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(pre_order_item: PreOrderItem)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg dataEntities: PreOrderItem)

    @Query("SELECT * FROM pre_order_item WHERE is_delete=0 and is_active=1 ")
    fun getAll():List<PreOrderItem>?

    @Delete
    fun delete(pre_order_item: PreOrderItem)

    @Update
    fun update(pre_order_item: PreOrderItem)
}