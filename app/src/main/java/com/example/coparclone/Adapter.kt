package com.example.coparclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter {
    class UserAdapter(val baseList: List<PizzaModel>): RecyclerView.Adapter<UserAdapter.ItemHolder>() {
        inner class ItemHolder(view: View) : RecyclerView.ViewHolder(view)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
            return ItemHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.activity_main, parent, false)
            )
        }

        override fun onBindViewHolder(holder: ItemHolder, position: Int) {
            val itemData = baseList[position]
            holder.itemView.findViewById<ImageView>(R.id.img).setImageResource(itemData.img)
            holder.itemView.findViewById<TextView>(R.id.text).text = itemData.text
        }

        override fun getItemCount(): Int {
            return baseList.size
        }
    }
}
