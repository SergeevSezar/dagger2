package com.example.dagger2.example_two.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2.R
import com.example.dagger2.example1.Activity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activity = Activity()
        activity.computer.toString()
//        activity.mouse.toString()
//        activity.monitor.toString()
    }
}