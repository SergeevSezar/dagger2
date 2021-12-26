package com.example.dagger2.example2.presentation

import androidx.lifecycle.ViewModel
import com.example.dagger2.example2.domain.ExampleRepository
import com.example.dagger2.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel2 @Inject constructor(
    private val repository: ExampleRepository
): ViewModel() {

    fun method() {
        repository.method()
    }
}
