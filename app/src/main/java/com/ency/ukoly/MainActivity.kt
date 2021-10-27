package com.ency.ukoly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tasksBtn = findViewById<Button>(R.id.tasksBtn)
        val playBtn = findViewById<Button>(R.id.playBtn)

        tasksBtn.setOnClickListener {
            val intent = Intent(this, TasksActivity::class.java)
            startActivity(intent)
        }

        playBtn.setOnClickListener {

        }

    }
}