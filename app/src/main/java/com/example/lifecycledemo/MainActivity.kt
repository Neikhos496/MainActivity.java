package com.example.lifecycledemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "ActivityLifecycle"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: Activity Created")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: Activity Visible")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: Activity Running")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: Activity Paused")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: Activity Stopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: Activity Destroyed")
    }
}