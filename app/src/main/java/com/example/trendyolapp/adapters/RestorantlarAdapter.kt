package com.example.trendyolapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trendyolapp.data.entity.Restoranlar
import com.example.trendyolapp.databinding.RestoranlarCartBinding
import com.example.trendyolapp.viewmodels.KesfetViewModel

class RestorantlarAdapter(var mContext: Context,var restorantlarList: MutableList<Restoranlar>,var viewmodel: KesfetViewModel):RecyclerView.Adapter<RestorantlarAdapter.RestorantlarViewHolder>() {

    inner class RestorantlarViewHolder(var binding:RestoranlarCartBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestorantlarViewHolder {
        val binding=RestoranlarCartBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return RestorantlarViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return restorantlarList.size
    }

    override fun onBindViewHolder(holder: RestorantlarViewHolder, position: Int) {
        val restoranlar=restorantlarList[position]
        holder.binding.restorantImage.setImageResource(mContext.resources.getIdentifier(restoranlar.resim,"drawable",mContext.packageName))
        holder.binding.restorantName.text=restoranlar.isim
        holder.binding.minSepetTutar.text="Min. ${restoranlar.fiyat} TL "
        holder.binding.urun.text="-${restoranlar.tur}"
        holder.binding.kuryeSuresi.text="${restoranlar.sure}dk"
        holder.binding.mesafe.text="-${restoranlar.mesafe} km"
    }
}