package com.example.trendyolapp.di

import com.example.trendyolapp.data.datasource.KesfetDataSource
import com.example.trendyolapp.data.repository.KesfetRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideKesfetDataSource(): KesfetDataSource {
        return KesfetDataSource()
    }

    @Provides
    @Singleton
    fun provideKesfetRepository(kds: KesfetDataSource): KesfetRepository {
        return KesfetRepository(kds)
    }

}