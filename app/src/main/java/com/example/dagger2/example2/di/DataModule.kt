package com.example.dagger2.example2.di

import android.content.Context
import com.example.dagger2.example2.data.datasource.ExampleLocalDataSource
import com.example.dagger2.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.dagger2.example2.data.datasource.ExampleRemoteDataSource
import com.example.dagger2.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DataModule(private val context: Context) {

    @Provides
    fun providesContext(): Context {
        return context
    }

    @Provides
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource {
        return impl
    }

    @Provides
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource {
        return impl
    }
}