package com.example.dagger2.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dagger2.example2.di.ApplicationScopes
import javax.inject.Inject
import javax.inject.Provider

@ApplicationScopes
class ViewModelFactory @Inject constructor(
    private val viewModelProviders: @JvmSuppressWildcards Map<String, Provider<ViewModel>>
): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
       return viewModelProviders[modelClass.simpleName]?.get() as T
    }
}