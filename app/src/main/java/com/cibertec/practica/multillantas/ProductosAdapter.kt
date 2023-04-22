package com.cibertec.practica.multillantas

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProductosAdapter (val listado : List<Productos>) :
    RecyclerView.Adapter<ProductosViewHolder>()
{
    override fun getItemCount(): Int = listado.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductosViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ProductosViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: ProductosViewHolder, position: Int) {
        val productos: Productos = listado[position]
        holder.bind(productos)
    }
}