package com.app.teachsphere.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.teachsphere.R
import com.app.teachsphere.model.TutorModel
import com.squareup.picasso.Picasso


class BestTutorAdapter(private val listTutor: ArrayList<TutorModel>) : RecyclerView.Adapter<BestTutorAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto :ImageView = itemView.findViewById(R.id.imageProfile)
        val tvnama : TextView = itemView.findViewById(R.id.usernameProfile)
        val tvalamat : TextView = itemView.findViewById(R.id.alamat)
        val tvharga : TextView = itemView.findViewById(R.id.harga)
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BestTutorAdapter.ListViewHolder {
       val view:View = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: BestTutorAdapter.ListViewHolder, position: Int) {
        val (id, nama, alamat, harga, gambar) = listTutor [position]
        holder.tvnama.text = nama
        holder.tvalamat.text = alamat
        holder.tvharga.text = harga
        Picasso.get().load(gambar).into(holder.foto)

    }

    override fun getItemCount(): Int {
        return listTutor.size
    }

}