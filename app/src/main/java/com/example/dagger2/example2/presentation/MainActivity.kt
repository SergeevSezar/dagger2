package com.example.dagger2.example2.presentation

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.dagger2.R
import com.example.dagger2.example2.ExampleApplication
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel::class.java]
    }

    private val component by lazy {
        (application as ExampleApplication).component
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
        findViewById<TextView>(R.id.main_activity_layout).setOnClickListener {
            Intent(this, MainActivity2::class.java).apply {
                startActivity(this)
            }
        }
    }
}