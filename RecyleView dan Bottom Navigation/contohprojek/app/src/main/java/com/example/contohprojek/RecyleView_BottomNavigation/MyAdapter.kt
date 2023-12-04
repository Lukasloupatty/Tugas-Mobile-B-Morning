package com.example.contohprojek.RecyleView_BottomNavigation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.contohprojek.R
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter (private val newList : ArrayList<New>) :
    RecyclerView.Adapter<MyAdapter.MyviewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list, parent,false)
        return MyviewHolder(itemView)
    }

    override fun getItemCount(): Int {

        return newList.size
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {

        val currentItem = newList [position]
        holder.titleImeg.setImageResource(currentItem.titleImage)
        holder.tvHeading.text = currentItem.heading
    }

    class MyviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val titleImeg : ShapeableImageView = itemView.findViewById(R.id.img_title)
        val tvHeading : TextView = itemView.findViewById(R.id.tv_titel)

    }

}