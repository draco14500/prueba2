package com.example.prueba_20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class segundapantalla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segundapantalla)


        val transferencia = findViewById<Button>(R.id.transferencia)

        transferencia.setOnClickListener {
            val intencion = Intent( this, tercerapantalla::class.java)
            startActivity(intencion)
        }
    }
}
