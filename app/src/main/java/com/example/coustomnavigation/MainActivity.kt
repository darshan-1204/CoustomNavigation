package com.example.coustomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.ImageView
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {

    lateinit var menu :ImageView
    lateinit var drawer:DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menu = findViewById(R.id.menu)
        drawer = findViewById(R.id.drawer)

        menu.setOnClickListener(){

            drawer.openDrawer(Gravity.LEFT)
        }
    }
}