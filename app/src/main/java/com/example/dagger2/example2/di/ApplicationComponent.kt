package com.example.dagger2.example2.di

import android.content.Context
import com.example.dagger2.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScopes
@Component(modules = [DataModule::class, DomainModule::class, ViewModelModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)

   @Component.Factory
   interface ApplicationComponentFactory{
       fun create(@BindsInstance context: Context): ApplicationComponent
   }
}