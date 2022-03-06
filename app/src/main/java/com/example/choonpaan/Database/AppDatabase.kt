package com.example.choonpaan.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.choonpaan.database.dao.*
import com.example.choonpaan.database.entity.*
import java.util.concurrent.Executors

@Database(entities = [ User::class,Item::class,PreOrderItem::class,Order::class,OrderDetail::class],version = 1)

abstract class AppDatabase :RoomDatabase(){
    abstract fun userDao(): UserDao
    abstract fun itemDao(): ItemDao
    abstract fun preOrderItemDao(): PreOrderItemDao
    abstract fun orderDao(): OrderDao
    abstract fun orderDetailDao(): OrderDetailDao

    companion object{
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context) :AppDatabase{
            if (INSTANCE==null){
                INSTANCE ?: synchronized(this) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "app-database"
                    )
                        .allowMainThreadQueries()
                        .fallbackToDestructiveMigration()
                        .addCallback(object: Callback(){
                            override fun onCreate(db: SupportSQLiteDatabase) {
                                super.onCreate(db)

                            }
                        })
                        .build()

                }
            }
            return INSTANCE!!
        }
    }
}