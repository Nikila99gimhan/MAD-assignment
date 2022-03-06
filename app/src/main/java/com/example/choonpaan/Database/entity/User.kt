package com.example.choonpaan.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")

data class User(
    @PrimaryKey var id: Int?,
    var first_name:String,
    var last_name:String,
    var pro_pic:String,
    var email:String,
    var phone_no:String,
    var address:String,
    var password:String,
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