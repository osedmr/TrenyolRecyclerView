package com.example.trendyolapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.trendyolapp.R
import com.example.trendyolapp.adapters.MutfaklarAdapter
import com.example.trendyolapp.adapters.RestorantlarAdapter
import com.example.trendyolapp.adapters.SliderAdapter
import com.example.trendyolapp.data.entity.Mutfaklar
import com.example.trendyolapp.data.entity.Restoranlar
import com.example.trendyolapp.databinding.FragmentKesfetBinding


class KesfetFragment : Fragment() {


    private lateinit var binding:FragmentKesfetBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding=FragmentKesfetBinding.inflate(inflater,container,false)

        restoranlarRV()

        sliderImage()
        MutfaklarRV()

        return binding.root
    }



    fun restoranlarRV(){
        binding.restorantRV.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        val restoranlar=ArrayList<Restoranlar>()
        val r1=Restoranlar(0,"tavuk","Dürümle",110,"Dürüm","35-45",1.7)
        val r2=Restoranlar(1,"evyemekleri","Ailem Ev Yemekeleri",110,"Ev Yemekleri","25-30",1.0)
        val r3=Restoranlar(2,"kebab","Kardeşler Kebab",110,"Dürüm","25-30",2.7)
        val r4=Restoranlar(3,"pide","Pidem",110,"Pide & Lahmacun","30-35",0.7)
        val r5=Restoranlar(4,"popeyes","Popeyes",110,"Burger,Tavuk","45-55",1.3)
        val r6=Restoranlar(5,"tavukdoner","Antakya Babacan",110,"Dürüm","25-30",1.8)

        restoranlar.add(r1)
        restoranlar.add(r2)
        restoranlar.add(r3)
        restoranlar.add(r4)
        restoranlar.add(r5)
        restoranlar.add(r6)

        val adapter=RestorantlarAdapter(requireContext(),restoranlar)
        binding.restorantRV.adapter=adapter
    }
    fun MutfaklarRV(){
        binding.mutfaklarRV.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        val mutfaklar=ArrayList<Mutfaklar>()
        var m1=Mutfaklar(0,"Hamburger","hamburger")
        var m2=Mutfaklar(1,"Pizza","pizza")
        var m3=Mutfaklar(2,"Pastane","pastane")
        val m4=Mutfaklar(3,"Sokak Lezzeti","sokaklezzeti")
        val m6=Mutfaklar(5,"Döner","doner")
        var m5=Mutfaklar(0,"Hamburger","hamburger")
        var m7=Mutfaklar(2,"Pastane","pastane")
        var m8=Mutfaklar(1,"Pizza","pizza")

        mutfaklar.add(m1)
        mutfaklar.add(m2)
        mutfaklar.add(m3)
        mutfaklar.add(m4)
        mutfaklar.add(m5)
        mutfaklar.add(m6)
        mutfaklar.add(m7)
        mutfaklar.add(m8)

        val adapter= MutfaklarAdapter(requireContext(),mutfaklar)
        binding.mutfaklarRV.adapter=adapter




    }

    fun sliderImage(){
        // Resimlerin listesini oluştur
        val images = listOf(
            R.drawable.popeyesslider,
            R.drawable.arbys,
            R.drawable.dominos
        )

        // Adapter'i ayarla
        val adapter = SliderAdapter(images)
        binding.viewPager.adapter = adapter
    }

}