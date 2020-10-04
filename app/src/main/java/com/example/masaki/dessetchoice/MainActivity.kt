package com.example.masaki.dessetchoice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        val intent = Intent(this,ListActivity::class.java)
        startActivity(intent)

        return true
    }
}