package com.example.dagger2.example2.di

import com.example.dagger2.example2.data.repository.ExampleRepositoryImpl
import com.example.dagger2.example2.domain.ExampleRepository
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    @Provides
    fun provideRepository(impl: ExampleRepositoryImpl): ExampleRepository {
        return impl
    }
}