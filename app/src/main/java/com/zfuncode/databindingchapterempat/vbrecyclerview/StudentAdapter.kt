package com.zfuncode.databindingchapterempat.vbrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zfuncode.databindingchapterempat.databinding.ItemStudentBinding

class StudentAdapter():RecyclerView.Adapter<StudentAdapter.ViewHolder>() {

    class ViewHolder(val binding : ItemStudentBinding) :RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = ItemStudentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.studentName.text = "Anisa"
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}