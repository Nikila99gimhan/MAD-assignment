package com.example.choonpaan.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")

data class User(
    @PrimaryKey (autoGenerate = true) var id: Int?,
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

{
    //companion object{
        //fun populate()= arrayOf(
            //User(1,"David","Perera","https://mad-kotlin.s3.amazonaws.com/download.jfif","david.perera@gmail.com","0778456921","No,68,Peris Rd, Galle","123456789",true,false),
            //User(2,"Helen","Gunasinghe","https://mad-kotlin.s3.amazonaws.com/download.jfif","gunasinghe.helen@gmail.com","0778153980","No,41,Katukurundha, Kalutara","987654321",true,false),
            //)
    //}
}