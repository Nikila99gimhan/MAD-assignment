package com.example.choonpaan.database.dao

import android.content.ClipData
import androidx.room.*



@Dao
interface ItemDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(item: ClipData.Item)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg dataEntities: ClipData.Item)

    @Query("SELECT * FROM item WHERE is_delete=0 and is_active=1 ")
    fun getAll():List<ClipData.Item>?

    @Delete
    fun delete(item: ClipData.Item)

    @Update
    fun update(item: ClipData.Item)
}