package com.cibertec.practica.multillantas

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.cibertec.practica.R
import com.google.android.material.textfield.TextInputEditText


class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val boton = findViewById<Button>(R.id.btnLogin)
        boton.setOnClickListener{
            val usuario = findViewById<EditText>(R.id.txtUsuario)
            val clave = findViewById<EditText>(R.id.txtContrasenia)
            if (usuario.text.toString() == "uwu" && clave.text.toString() == "ohmevengo")
            {
                startActivity(Intent(this, ProductosActivity::class.java))
            }
            else
            {
                Toast.makeText(this, "Usuario o clave incorrectos.", Toast.LENGTH_SHORT).show()
            }
        }

        val ocultar = supportActionBar
        ocultar?.hide()
    }
}