package com.example.prueba_20

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val compartidaP = "com.example.evaluacion2.preferences_ini_sesion"

        val codigo = findViewById<EditText>(R.id.codigo)
        val descripcion = findViewById<EditText>(R.id.descripcion)
        val precio = findViewById<EditText>(R.id.precio)

        val crearBoton = findViewById<Button>(R.id.boton)
        crearBoton.setOnClickListener {
            val compP = getSharedPreferences(compartidaP, Context.MODE_PRIVATE)
            val editor = compP.edit()

            editor.putString("codigoInit", codigo.text.toString())
            editor.putString("descripcionInit", descripcion.text.toString())
            editor.putString("precioInit", precio.text.toString())

            editor.apply()
        }

        val ingrese = findViewById<Button>(R.id.boton)
        ingrese.setOnClickListener {
            val intencion = Intent(this, segundapantalla::class.java)
            startActivity(intencion)
        }
    }
}