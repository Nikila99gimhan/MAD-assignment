package com.example.choonpaan.database.entity


import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "order")
data class Order(

    @PrimaryKey (autoGenerate = true) var id: Int?,
    var total:Double,
    var cash:Double,
    var card:Double,
    var time:String?,
)