package com.ency.ukoly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        setTheme(R.style.Theme_Ukoly)
//        val theme = "day"

        val tasksBtn = findViewById<Button>(R.id.tasksBtn)
        val playBtn = findViewById<Button>(R.id.playBtn)
//        val themeBtn = findViewById<Button>(R.id.themeBtn)

        tasksBtn.setOnClickListener {
            val intent = Intent(this, TasksActivity::class.java)
            startActivity(intent)
        }

        playBtn.setOnClickListener {
            val intent = Intent(this, PlayActivity::class.java)
            startActivity(intent)
        }

//        themeBtn.setOnClickListener {
//            if (theme == "day") {
//                setTheme(R.style.Theme_Ukoly)
//
//            } else if (theme == "night") {
//                setTheme(R.style.DarkTheme)
//            }
//        }
    }
}