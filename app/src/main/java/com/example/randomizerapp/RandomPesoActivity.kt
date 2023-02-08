package com.example.randomizerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class RandomPesoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_peso)

        title = "Random Face"

        var imageViewCoin:ImageView = findViewById(R.id.imageViewCoin)
        var buttonFlip: Button = findViewById(R.id.buttonFlip)
        var buttonBack:Button = findViewById(R.id.buttonBack)

        val images: IntArray = intArrayOf(
            R.drawable.peso1,
            R.drawable.peso2

        )

        buttonFlip.setOnClickListener(){
            var random = Random
            imageViewCoin.setImageResource(images[random.nextInt(images.size)])
        }

        buttonBack.setOnClickListener(){
            startActivity(Intent(this,MainActivity::class.java))
        }

    }
}