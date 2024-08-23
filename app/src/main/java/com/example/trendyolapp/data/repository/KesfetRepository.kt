package com.example.trendyolapp.data.repository

import com.example.trendyolapp.data.datasource.KesfetDataSource
import com.example.trendyolapp.data.entity.Mutfaklar
import com.example.trendyolapp.data.entity.Restoranlar

class KesfetRepository {

    val kds= KesfetDataSource()
    suspend fun restoranlarYukle():List<Restoranlar> = kds.restoranlarYukle()
    suspend fun MutfaklarYukle():List<Mutfaklar> = kds.MutfaklarYukle()
    suspend fun getSliderImages(): List<Int> = kds.getSliderImages()
}