package com.example.dagger2.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}