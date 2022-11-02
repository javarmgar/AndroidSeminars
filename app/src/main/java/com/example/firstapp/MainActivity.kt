package com.example.firstapp

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView1 = findViewById(R.id.text1)
        textView1.setOnClickListener {
            textView1.setTextColor(Color.CYAN)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Ari", "onStart");
    }

    override fun onPause() {
        super.onPause()
        Log.d("Ari", "onPause");
    }

    override fun onResume() {
        super.onResume()
        Log.d("Ari ", "onResume");
    }

    override fun onStop() {
        super.onStop()
        Log.d("Ari ", "onStop");
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Ari ", "onRestart");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ari ", "onDestroy");
    }
}