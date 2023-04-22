package com.cibertec.practica.multillantas

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cibertec.practica.R

class ProductosViewHolder (inflater: LayoutInflater, parent:ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_productos, parent, false))
{
    private var img : ImageView? = null
    private var titulo : TextView? = null
    private var descripcion : TextView? = null

    init {
        img = itemView.findViewById(R.id.imgRecycler)
        titulo = itemView.findViewById(R.id.txtTitulo)
        descripcion = itemView.findViewById(R.id.txtDescripcion)
    }

    fun bind (productos : Productos)
    {
        img?.setImageResource(productos.imagen)
        titulo?.text = productos.titulo
        descripcion?.text = productos.descripcion
    }

}