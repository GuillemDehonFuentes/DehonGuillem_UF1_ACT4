package com.example.uf1_act4_logcatitoast_guillemdehon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast;
import android.widget.Button;
import android.util.Log;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btLogCat = findViewById<Button>(R.id.buton1)
        btLogCat.setOnClickListener{
            Log.d("MainActivity","Muy bien te gusta shrek 2")
        }

        val btnToast = findViewById<Button>(R.id.buton2)
        btnToast.setOnClickListener{
            Toast.makeText(this, "Vas a morir", Toast.LENGTH_SHORT).show()
        }
    }
}