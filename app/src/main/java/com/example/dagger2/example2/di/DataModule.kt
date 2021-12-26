package com.example.dagger2.example2.di

import com.example.dagger2.example2.data.datasource.ExampleLocalDataSource
import com.example.dagger2.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.dagger2.example2.data.datasource.ExampleRemoteDataSource
import com.example.dagger2.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @ApplicationScopes
    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ApplicationScopes
    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}