package com.example.trendyolapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.trendyolapp.R
import com.example.trendyolapp.adapters.MutfaklarAdapter
import com.example.trendyolapp.adapters.RestorantlarAdapter
import com.example.trendyolapp.adapters.SliderAdapter
import com.example.trendyolapp.data.entity.Mutfaklar
import com.example.trendyolapp.data.entity.Restoranlar
import com.example.trendyolapp.databinding.FragmentKesfetBinding
import com.example.trendyolapp.viewmodels.KesfetViewModel


class KesfetFragment : Fragment() {
    private lateinit var binding:FragmentKesfetBinding
    private lateinit var viewmodel: KesfetViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View{
        // Inflate the layout for this fragment
        binding=FragmentKesfetBinding.inflate(inflater,container,false)

        restoranlarRV()
        sliderImage()
        MutfaklarRV()

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel:KesfetViewModel by viewModels()
        viewmodel=tempViewModel
    }

    fun restoranlarRV(){

        viewmodel.restoranlarListesi.observe(viewLifecycleOwner){
            binding.restorantRV.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            val adapter=RestorantlarAdapter(requireContext(),it.toMutableList(),viewmodel)
            binding.restorantRV.adapter=adapter
        }
    }
    fun MutfaklarRV(){
        viewmodel.mutfaklarListesi.observe(viewLifecycleOwner){
            binding.mutfaklarRV.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
            val adapter= MutfaklarAdapter(requireContext(),it.toMutableList(),viewmodel)
            binding.mutfaklarRV.adapter=adapter
        }
    }

    fun sliderImage(){
        // Resimlerin listesini oluştur

        viewmodel.getSliderImages.observe(viewLifecycleOwner){
            // Adapter'i ayarla
            val adapter = SliderAdapter(it.toMutableList(),viewmodel)
            binding.viewPager.adapter = adapter
        }


    }

}