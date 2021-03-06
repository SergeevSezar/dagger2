package com.example.dagger2.example2.data.database

import android.content.Context
import android.util.Log
import com.example.dagger2.R
import com.example.dagger2.example2.di.ApplicationScopes
import javax.inject.Inject
import javax.inject.Singleton

class ExampleDatabase @Inject constructor(
    private val context: Context
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase ${context.getString(R.string.app_name)}")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
