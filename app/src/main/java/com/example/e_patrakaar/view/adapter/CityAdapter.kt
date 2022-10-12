package com.example.e_patrakaar.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.e_patrakaar.databinding.CustomCityItemBinding
import com.example.e_patrakaar.model.Collection

class CityAdapter(private val fragment: Fragment, private val list: List<Collection>): RecyclerView.Adapter<CityAdapter.ViewHolder>() {

    class ViewHolder(view: CustomCityItemBinding) : RecyclerView.ViewHolder(view.root) {
        val text: TextView = view.textView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(CustomCityItemBinding.inflate(LayoutInflater.from(fragment.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dish = list[position]
        holder.text.text = dish.text
    }

    override fun getItemCount(): Int {
        return list.size
    }

}