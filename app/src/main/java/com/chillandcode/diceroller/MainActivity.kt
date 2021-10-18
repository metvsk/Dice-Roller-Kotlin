package com.chillandcode.diceroller

import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
    val diceNum=firstDice.roll()
    findViewById<TextView>(R.id.textView).text=diceNum.toString()
    val diceImage=findViewById<ImageView>(R.id.imageView)
    when(diceNum){
        1->diceImage.setImageResource(R.drawable.dice_1)
        2->diceImage.setImageResource(R.drawable.dice_2)
        3->diceImage.setImageResource(R.drawable.dice_3)
        4->diceImage.setImageResource(R.drawable.dice_4)
        5->diceImage.setImageResource(R.drawable.dice_5)
        6->diceImage.setImageResource(R.drawable.dice_6)
    }

}

//        val secondDice = Dice(30)
//        firstDice.printResult()
//        secondDice.printResult()
        //println("Your first dice with ${firstDice.sides} sides rolled and resulted in : ${ firstDice.roll()}")
        //println("Your first dice with ${secondDice.sides} sides rolled and resulted in : ${ secondDice.roll()}")
    }


}