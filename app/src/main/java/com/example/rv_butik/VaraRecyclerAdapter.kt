package com.example.rv_butik

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VaraRecyclerAdapter (
    val context: Context,
    val varor : List<Vara>)
    : RecyclerView.Adapter<VaraRecyclerAdapter.ViewHolder>() {

    val layoutInflater = LayoutInflater.from(context)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.list_item, parent, false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val vara = varor[position]

        holder.nameTextView.text = vara.name
        holder.priceTextView.text = vara.price.toString()
        holder.varaImageView.id = vara.image

    }

    override fun getItemCount() = varor.size    //same as return size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView = itemView.findViewById<TextView>(R.id.nameTextView)
        val priceTextView = itemView.findViewById<TextView>(R.id.priceTextView)
        val varaImageView = itemView.findViewById<CheckBox>(R.id.varaImageView)

    }



}