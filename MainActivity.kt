package com.example.linearlayout1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnCenter = findViewById<Button>(R.id.button_tengah)
        val btnLeft = findViewById<Button>(R.id.button_kiri)
        val btnRight = findViewById<Button>(R.id.button_kanan)

        btnCenter.setOnClickListener{
            Toast.makeText(this, "YOU PUSSED Tengah", Toast.LENGTH_SHORT).show()

        }
        btnLeft.setOnClickListener {
            Toast.makeText(this, "toupuused kiri", Toast.LENGTH_SHORT).show()

        }
        btnRight.setOnClickListener{
            Toast.makeText(this, "KANANANNAANANNA", Toast.LENGTH_SHORT).show()
        }
    }
}
