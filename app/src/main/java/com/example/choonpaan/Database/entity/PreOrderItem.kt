package com.example.choonpaan.database.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "pre_order_item",foreignKeys = [ForeignKey(entity = Item::class,parentColumns = ["id"],childColumns = ["item_id"])])

data class PreOrderItem(
    @PrimaryKey var id: Int?,
    var item_id:Int,
    var is_active:Boolean,
    var is_delete:Boolean
)

//{
//    companion object{
//        fun populate()= arrayOf(
//            Category(1,"Soup",true,false),
//            Category(2,"Brush",true,false)
//        )
//    }
//}