package com.example.choonpaan.database.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.example.choonpaan.database.entity.Item

@Entity(tableName = "orderdetail",foreignKeys = [ForeignKey(entity = Order::class,parentColumns = ["id"],childColumns = ["order_id"]),ForeignKey(entity = Item::class,parentColumns = ["id"],childColumns = ["item_id"])])
data class OrderDetail(

    @PrimaryKey(autoGenerate = true) var id: Int?,
    var item_id:Int,
    var order_id:Long,
    var quantity:Int,
    var price:Double,
)
