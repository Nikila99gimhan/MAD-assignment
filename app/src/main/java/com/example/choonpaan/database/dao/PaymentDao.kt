package com.example.choonpaan.database.dao


import androidx.room.*
import com.example.choonpaan.database.entity.Payment


@Dao
interface PaymentDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(payment: Payment)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg dataEntities: Payment)

    @Query("SELECT * FROM payment WHERE is_delete=0 and is_active=1 ")
    fun getAll():List<Payment>?

    @Delete
    fun delete(payment: Payment)

    @Update
    fun update(payment: Payment)
}