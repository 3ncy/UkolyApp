package com.ency.ukoly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PlayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)
        title = "Do or Drink!"

    }
}