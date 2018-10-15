package com.fridge_manager.Adapter

import android.service.autofill.TextValueSanitizer
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.fridge_manager.Model.MyFridgeItem
import com.fridge_manager.R

class MyFridgeListAdapter(val items : ArrayList<MyFridgeItem>) : RecyclerView.Adapter<MyFridgeListAdapter.MyFridgeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MyFridgeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_myfridge,parent,false)
        return MyFridgeViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyFridgeViewHolder, position: Int) {
        holder.title.text = items[position].title
        holder.last_date.text = items[position].lastdate
        holder.contents_count.text = items[position].contents_count
    }

    override fun getItemCount(): Int = items.size

    inner class MyFridgeViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val title = itemView.findViewById<TextView>(R.id.item_myfridge_title_tv)
        val last_date = itemView.findViewById<TextView>(R.id.item_myfridge_lastdate_content)
        val contents_count = itemView.findViewById<TextView>(R.id.item_myfridge_contents_count)
    }
}