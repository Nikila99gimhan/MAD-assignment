package com.example.choonpaan.Database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "item")

data class Item(
    @PrimaryKey var id: Int?,
    var name:String,
    var price:Double,
    var image:String,
    var is_new_arrival:Boolean,
    var is_favourite:Boolean,
    var is_active:Boolean,
    var is_delete:Boolean
)

{
    companion object{
        fun populate()= arrayOf(
            Item(1,"Sausage bun",30.00,"https://mad-kotlin.s3.amazonaws.com/download.jfif",true,false,true,true),
            Item(2,"Spongy Cake",35.00,"https://mad-kotlin.s3.amazonaws.com/28bf1142-91c1-4ec7-8bb1-5e5f0bfdfdec.jpg",true,false,true,true),
            Item(3,"Chocolate Cake Piece ",40.00,"https://mad-kotlin.s3.amazonaws.com/chocolate-cake-1.jpg",true,false,true,true),
            Item(4,"Doughnut",50.00,"https://mad-kotlin.s3.amazonaws.com/4615-3-large.jpg",true,false,true,true),
            Item(5,"Pittu with Lunumiriss",50.00, "https://mad-kotlin.s3.amazonaws.com/c5f1e1077112511ece0bbc1d760398b4.jpg",true,false,true,true),
            Item(6,"Hoppers with Lunumiriss",25.00, "https://mad-kotlin.s3.amazonaws.com/depositphotos_115942104-stock-photo-sri-lankan-style-plain-hoppers.jpg",true,false,true,true),
            Item(7,"Jam Bun",30.00, "https://mad-kotlin.s3.amazonaws.com/Jam-buns-4-low.jpg",true,false,true,true),
            Item(8,"Bread",80.00, "https://mad-kotlin.s3.amazonaws.com/homemade-white-bread-loaf-feature.jpg",true,false,true,true),
            Item(9,"Egg Bun",40.00, "https://mad-kotlin.s3.amazonaws.com/maxresdefault.jpg",true,false,true,true),
            Item(10,"Milk Rice with Linumiriss",60.00, "https://mad-kotlin.s3.amazonaws.com/milk-rice1.jpg",true,false,true,true),
            Item(11,"CHINESE_ROLL",50.00, "https://mad-kotlin.s3.amazonaws.com/PREMIUM_FISH_CHINESE_ROLL.jpg",true,false,true,true),
            Item(12,"Puff-Pastry",40.00, "https://mad-kotlin.s3.amazonaws.com/Puff-Pastry-Feature.jpg",true,false,true,true),



        )
    }
}