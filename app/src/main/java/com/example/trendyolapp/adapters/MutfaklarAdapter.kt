package com.example.trendyolapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trendyolapp.data.entity.Mutfaklar
import com.example.trendyolapp.databinding.MutfaklarCartBinding

class MutfaklarAdapter(var mContext: Context,var mutfaklarList:List<Mutfaklar>):RecyclerView.Adapter<MutfaklarAdapter.MutfaklarViewHolder>() {

    inner class MutfaklarViewHolder(var binding:MutfaklarCartBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MutfaklarViewHolder {
        val binding=MutfaklarCartBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return MutfaklarViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return mutfaklarList.size
    }

    override fun onBindViewHolder(holder: MutfaklarViewHolder, position: Int) {
        val list=mutfaklarList[position]
        holder.binding.mutfaklarImage.setImageResource(mContext.resources.getIdentifier(list.photo,"drawable",mContext.packageName))
        holder.binding.mutfaklarName.text=list.name
    }
}