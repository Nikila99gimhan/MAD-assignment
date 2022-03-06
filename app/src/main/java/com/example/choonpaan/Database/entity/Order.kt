package com.example.choonpaan.database.entity


import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "order")
data class Order(

    @PrimaryKey var id: Long?,
    var total:Double,
    var cash:Double,
    var card:Double,
    var time:String?,
)