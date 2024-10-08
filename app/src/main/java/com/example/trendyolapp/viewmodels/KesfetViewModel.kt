package com.example.trendyolapp.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.trendyolapp.data.entity.Mutfaklar
import com.example.trendyolapp.data.entity.Restoranlar
import com.example.trendyolapp.data.repository.KesfetRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class KesfetViewModel @Inject constructor(var krepo: KesfetRepository) :ViewModel() {

    var restoranlarListesi= MutableLiveData<List<Restoranlar>>()
    var mutfaklarListesi=MutableLiveData<List<Mutfaklar>>()
    var getSliderImages=MutableLiveData<List<Int>>()

    init {
        restoranlarYukle()
        mutfaklarYukle()
        getSliderImages()
    }

    fun restoranlarYukle(){
        CoroutineScope(Dispatchers.Main).launch {
            restoranlarListesi.value = krepo.restoranlarYukle()
        }
    }
     fun mutfaklarYukle(){
         CoroutineScope(Dispatchers.Main).launch {
             mutfaklarListesi.value=krepo.MutfaklarYukle()
         }

    }
    fun getSliderImages(){
        CoroutineScope(Dispatchers.Main).launch {
            getSliderImages.value=krepo.getSliderImages()
        }
    }
}