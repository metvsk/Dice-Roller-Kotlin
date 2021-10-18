package com.chillandcode.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG: String="Main Activity : "
    val diceRange:IntRange=1..6
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollDice()
    }


    private fun rollDice(){
        val randomNumber=diceRange.random()
        Log.i(TAG, "rollDice: dice value is : $randomNumber")
    }
}