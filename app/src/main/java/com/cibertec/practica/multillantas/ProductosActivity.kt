package com.cibertec.practica.multillantas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cibertec.practica.R

class ProductosActivity: AppCompatActivity() {

    val listadoProductos = listOf(
        Productos("Neumáticos", "Tenemos neumáticos para autos, camiones, camioncitos, etc.", R.drawable.neumaticos),
        Productos("Aros", "Tenemos aros de rodaje 12, 13, 14, 15, 16, 17 y más.", R.drawable.aros),
        Productos("Baterías", "Tenemos baterías para su vehículo. Diversidad cantidad de placas.", R.drawable.baterias),
        Productos("Lubricantes", "Tenemos lubricantes para su vehículo. Ya sea petrolero u otro.", R.drawable.lubricantes)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos) // Mostrar activity_productos

        val recyclerProductos = findViewById<RecyclerView>(R.id.recyclerProductos)
        recyclerProductos.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = ProductosAdapter(listadoProductos)
        }

        // Ocultar parte superior de la actividad
        val esconder = supportActionBar
        esconder?.hide()

    }
}