package com.example.dagger2.example2

import android.app.Application
import com.example.dagger2.example2.di.DaggerApplicationComponent

class ExampleApplication: Application() {

    val component by lazy {
        DaggerApplicationComponent.factory()
            .create(this)
    }
}