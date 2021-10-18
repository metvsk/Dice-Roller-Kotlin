package com.chillandcode.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private val TAG: String = "Main Activity : "
    val diceRange: IntRange = 1..6
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstDice = Dice(6)
findViewById<Button>(R.id.button).setOnClickListener{
    findViewById<TextView>(R.id.textView).text=firstDice.roll().toString()
}

//        val secondDice = Dice(30)
//        firstDice.printResult()
//        secondDice.printResult()
        //println("Your first dice with ${firstDice.sides} sides rolled and resulted in : ${ firstDice.roll()}")
        //println("Your first dice with ${secondDice.sides} sides rolled and resulted in : ${ secondDice.roll()}")
    }


}