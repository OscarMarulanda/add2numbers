package com.example.addnumbers

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var numero1 = findViewById<EditText>(R.id.txtNumber1)
        var numero2 = findViewById<EditText>(R.id.txtNumber2)
        var boton1 = findViewById<Button>(R.id.sumarBoton)
        var resultado = findViewById<TextView>(R.id.resultado)

        boton1.setOnClickListener{

            resultado.text = (numero1.text.toString().toInt()+numero2.text.toString().toInt()).toString()
        }
    }
}