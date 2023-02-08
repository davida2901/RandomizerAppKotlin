package com.example.randomizerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Randomizer App"

        var diceActivity:Button = findViewById(R.id.buttonRandomDice)
        var pesoActivity:Button = findViewById(R.id.buttonRandomPesos)

        diceActivity.setOnClickListener(){
            startActivity(Intent(this, RandomDiceActivity::class.java))
        }

        pesoActivity.setOnClickListener(){
            startActivity(Intent(this, RandomPesoActivity::class.java))
        }


    }

}

