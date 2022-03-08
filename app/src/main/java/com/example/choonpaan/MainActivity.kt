package com.example.choonpaan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginbtn: Button =findViewById(R.id.buttonLogin)
        val signupbtn:Button=findViewById(R.id.signUpButton)

        loginbtn.setOnClickListener {
            val intent= Intent(this,ActivityLogin::class.java)
            startActivity(intent)
            Toast.makeText(this,"Login Page", Toast.LENGTH_SHORT).show()
            //showNotification()
        }
        signupbtn.setOnClickListener {
            val intent= Intent(this,RegistrationActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"Registration Page",Toast.LENGTH_SHORT).show()
        }
    }


    //private fun showNotification(){
        //val channelID="1000"
        //val notificationManager=getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        //val builder= NotificationCompat.Builder(applicationContext,channelID)
            //.setSmallIcon(R.drawable.ic_baseline_notifications_24)
            //.setContentTitle("Login")
            //.setContentText("You are logged in to your account")
            //.setTimeoutAfter(10000)

        //if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            //val channel = NotificationChannel(channelID,"Custom Notification", NotificationManager.IMPORTANCE_DEFAULT)

            //channel.enableVibration(true)
            //notificationManager.createNotificationChannel(channel)
            //builder.setChannelId(channelID)
        //}
        //val notification=builder.build()

        //notificationManager.notify(1000,notification)
    //}

}