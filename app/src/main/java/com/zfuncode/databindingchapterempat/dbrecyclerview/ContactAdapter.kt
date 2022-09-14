package com.zfuncode.databindingchapterempat.dbrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zfuncode.databindingchapterempat.databinding.ItemContactBinding

class ContactAdapter(var lisKontak : ArrayList<Contact>, private val mListener : ItemClickListener):RecyclerView.Adapter<ContactAdapter.ViewHolder>() {



    class ViewHolder(var binding : ItemContactBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(itemData: Contact, listener: ItemClickListener){
            binding.listContact = itemData
            binding.detailKlik = listener

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = ItemContactBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(lisKontak[position], mListener)

    }

    override fun getItemCount(): Int {
        return  lisKontak.size
    }

    interface ItemClickListener {
        fun onItemClicked(detail: Contact)
    }


}