package com.example.trendyolapp.data.datasource

import com.example.trendyolapp.R
import com.example.trendyolapp.adapters.SliderAdapter
import com.example.trendyolapp.data.entity.Mutfaklar
import com.example.trendyolapp.data.entity.Restoranlar
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class KesfetDataSource {

   suspend fun restoranlarYukle():List<Restoranlar>{
       return withContext(Dispatchers.IO){
           val restoranlar=ArrayList<Restoranlar>()
           val r1= Restoranlar(0,"tavuk","Dürümle",110,"Dürüm","35-45",1.7)
           val r2= Restoranlar(1,"evyemekleri","Ailem Ev Yemekeleri",110,"Ev Yemekleri","25-30",1.0)
           val r3= Restoranlar(2,"kebab","Kardeşler Kebab",110,"Dürüm","25-30",2.7)
           val r4= Restoranlar(3,"pide","Pidem",110,"Pide & Lahmacun","30-35",0.7)
           val r5= Restoranlar(4,"popeyes","Popeyes",110,"Burger,Tavuk","45-55",1.3)
           val r6= Restoranlar(5,"tavukdoner","Antakya Babacan",110,"Dürüm","25-30",1.8)
           restoranlar.add(r1)
           restoranlar.add(r2)
           restoranlar.add(r3)
           restoranlar.add(r4)
           restoranlar.add(r5)
           restoranlar.add(r6)

           return@withContext restoranlar
       }

    }

   suspend fun MutfaklarYukle():List<Mutfaklar>{

       return withContext(Dispatchers.IO) {
           val mutfaklar = ArrayList<Mutfaklar>()
           var m1 = Mutfaklar(0, "Hamburger", "hamburger")
           var m2 = Mutfaklar(1, "Pizza", "pizza")
           var m3 = Mutfaklar(2, "Pastane", "pastane")
           val m4 = Mutfaklar(3, "Sokak Lezzeti", "sokaklezzeti")
           val m6 = Mutfaklar(5, "Döner", "doner")
           var m5 = Mutfaklar(0, "Hamburger", "hamburger")
           var m7 = Mutfaklar(2, "Pastane", "pastane")
           var m8 = Mutfaklar(1, "Pizza", "pizza")

           mutfaklar.add(m1)
           mutfaklar.add(m2)
           mutfaklar.add(m3)
           mutfaklar.add(m4)
           mutfaklar.add(m5)
           mutfaklar.add(m6)
           mutfaklar.add(m7)
           mutfaklar.add(m8)

           return@withContext mutfaklar
       }
    }

   suspend fun getSliderImages(): List<Int> {
        return listOf(
            R.drawable.popeyesslider,
            R.drawable.arbys,
            R.drawable.dominos
        )
    }
}