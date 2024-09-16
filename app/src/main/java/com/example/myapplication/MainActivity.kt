package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton1 = findViewById<Button>(R.id.button)
        val boton2 = findViewById<Button>(R.id.button2)
        val texto = findViewById<TextView>(R.id.textView2)

        boton1.setOnClickListener{
            texto.text ="Hola mundo!"
        }
        boton2.setOnClickListener{
            texto.text="Hello world!"

        }
    }

}