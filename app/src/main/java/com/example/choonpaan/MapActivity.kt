package com.example.choonpaan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.example.choonpaan.databinding.ActivityMapBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

//private val ActivityMapBinding.root: Int
    //get() {}

class MapActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val backbutton: Button = findViewById<Button>(R.id.button8)

        backbutton.setOnClickListener {
            val intent = Intent(this, ActivityLogin::class.java)
            startActivity(intent)
        }
        binding = ActivityMapBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        //val navController = findNavController(R.id.nav_host_fragment_activity_map)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        //setupActionBarWithNavController(navController, appBarConfiguration)
        //navView.setupWithNavController(navController as NavController)
    }

    private fun setupActionBarWithNavController(navController: Any, appBarConfiguration: Any) {
        TODO("Not yet implemented")
    }

    private fun findNavController(navHostFragmentActivityMap: Any): Any {
        TODO("Not yet implemented")
    }
}