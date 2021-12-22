package com.example.dagger2.example2.di

import com.example.dagger2.example2.data.datasource.ExampleLocalDataSource
import com.example.dagger2.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.dagger2.example2.data.datasource.ExampleRemoteDataSource
import com.example.dagger2.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun providesLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource {
        return impl
    }

    @Provides
    fun providesRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource {
        return impl
    }
}