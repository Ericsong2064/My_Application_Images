package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var num = 0
        val button: Button = findViewById(R.id.button)
        val image:ImageView = findViewById(R.id.imageView)
        button.setOnClickListener {
            num++
            if(num ==1) image.setImageResource(R.drawable.bird) else if(num ==2) image.setImageResource(R.drawable.dog) else if(num == 3) image.setImageResource(R.drawable.penguin)
            else if(num == 4){
                image.setImageResource(R.drawable.cat)
                num = 0
            }
            image.scaleType = ImageView.ScaleType.FIT_CENTER
        }
    }
}