package com.example.dagger2.example2.di

import com.example.dagger2.example2.presentation.MainActivity
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)
}