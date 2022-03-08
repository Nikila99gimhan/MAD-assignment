package com.example.choonpaan.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "payment")

data class Payment(
    @PrimaryKey (autoGenerate = true) var id: Int?,
    var bank_name:String,
    var type:String,
    var card_no:String,
    var cardholder_name:String,
    var expiry_date:String,
    var cvv:String,
    var is_active:Boolean,
    var is_delete:Boolean
)