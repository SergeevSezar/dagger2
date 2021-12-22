package com.example.dagger2.example2.di

import com.example.dagger2.example2.data.repository.ExampleRepositoryImpl
import com.example.dagger2.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository
}