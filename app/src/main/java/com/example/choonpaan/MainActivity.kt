package com.example.choonpaan

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.NotificationCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginbtn: Button =findViewById(R.id.buttonLogin)
        val signupbtn:Button=findViewById(R.id.signUpButton)

        loginbtn.setOnClickListener {
            val intent= Intent(this,Activity_Login::class.java)
            startActivity(intent)
            showNotification()
        }
        signupbtn.setOnClickListener {
            val intent= Intent(this,RegistrationActivity::class.java)
            startActivity(intent)
        }
    }
    private fun showNotification(){
        val channelID="1000"
        val notificationManager=getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val builder= NotificationCompat.Builder(applicationContext,channelID)
            .setSmallIcon(R.drawable.ic_baseline_notifications_24)
            .setContentTitle("Login")
            .setContentText("You are logged in to your account")

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val channel = NotificationChannel(channelID,"Custom Notification", NotificationManager.IMPORTANCE_DEFAULT)

            channel.enableVibration(true)
            notificationManager.createNotificationChannel(channel)
            builder.setChannelId(channelID)
        }
        val notification=builder.build()

        notificationManager.notify(1000,notification)
    }

}