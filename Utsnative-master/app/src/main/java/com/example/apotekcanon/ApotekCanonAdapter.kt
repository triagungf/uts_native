package com.example.apotekcanon

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ApotekCanonAdapter(private val context: Context, private val apotekcanon:List<ApotekCanon>,val listener:(ApotekCanon)->Unit)
    :RecyclerView.Adapter<ApotekCanonAdapter.ApotekCanonViewHolder>(){

    class ApotekCanonViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val imgObat = view.findViewById<ImageView>(R.id.image_view)
        val titleObat = view.findViewById<TextView>(R.id.nama_item)
        val descObat = view.findViewById<TextView>(R.id.description)

    fun bindView (apotekcanon: ApotekCanon,listener: (ApotekCanon) -> Unit){
        imgObat.setImageResource(apotekcanon.imgObat)
        titleObat.text=apotekcanon.titleObat
        descObat.text=apotekcanon.descObat
}

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ApotekCanonViewHolder {
        return ApotekCanonViewHolder(
            LayoutInflater.from(context).inflate(R.layout.card_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ApotekCanonViewHolder, position: Int) {
        holder.bindView(apotekcanon[position],listener)
    }

    override fun getItemCount(): Int = apotekcanon.size

    }
