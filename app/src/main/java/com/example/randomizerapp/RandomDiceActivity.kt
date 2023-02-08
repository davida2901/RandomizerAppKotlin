package com.example.randomizerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class RandomDiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_dice)


        title = "Random Dice"

        var imageViewDice: ImageView = findViewById(R.id.imageViewDice)
        var button: Button = findViewById(R.id.buttonRoll)
        var buttonBack:Button = findViewById(R.id.buttonBack2)

        val images: IntArray = intArrayOf(
            R.drawable.alea_2,
            R.drawable.alea_3,
            R.drawable.alea_4,
            R.drawable.alea_5,
            R.drawable.alea_6,
        )

        button.setOnClickListener(){
            var random = Random
            imageViewDice.setImageResource(images[random.nextInt(images.size)])
        }

        buttonBack.setOnClickListener(){
            startActivity(Intent(this,MainActivity::class.java))
        }



    }
}