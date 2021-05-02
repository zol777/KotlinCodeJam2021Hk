package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

/**
 * v mnbjmbmbk
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val diceImage: ImageView = findViewById(R.id.imageView)
            val diceRoll :Int = Dice(6).roll()
            val drawableResource = when(diceRoll) {
                1-> R.drawable.dice_1
                2-> R.drawable.dice_2
                3-> R.drawable.dice_3
                4-> R.drawable.dice_4
                5-> R.drawable.dice_5
                else-> R.drawable.dice_6
            }

            diceImage.setImageResource(drawableResource)
            diceImage.setContentDescription(diceRoll.toString())
        }


    }
}

class Dice (val sides: Int) {

    fun roll(): Int {
        return (1..sides).random()
    }
}