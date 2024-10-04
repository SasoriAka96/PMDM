package com.example.llamarawalter

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView2)
        val imageButton: ImageButton = findViewById(R.id.imageButton3)
        val imageButtonColgar: ImageButton = findViewById(R.id.imageButtonColgar)
        val imageView: ImageView = findViewById(R.id.imageView)
        imageButton.setOnClickListener {
            imageView.setImageResource(R.drawable.walterwhite2)
            textView.setText(R.string.llamando)
            imageButton.visibility = ImageButton.INVISIBLE
            imageButtonColgar.visibility = ImageButton.VISIBLE
        }
        imageButtonColgar.setOnClickListener {
            imageView.setImageResource(R.drawable.walterwhite)
            textView.setText(R.string.llamada_terminada)
            imageButton.visibility = ImageButton.VISIBLE
            imageButtonColgar.visibility = ImageButton.INVISIBLE
        }
    }
}
