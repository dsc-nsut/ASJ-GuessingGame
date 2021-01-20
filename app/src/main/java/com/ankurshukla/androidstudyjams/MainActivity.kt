package com.ankurshukla.androidstudyjams

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newNumber = generateRandomNumber()

        //int a = 10
        val myButton: Button = findViewById(R.id.submitButton)
        val userInput: EditText = findViewById(R.id.userInput)
        val result: TextView = findViewById(R.id.textResult)

        myButton.setOnClickListener {
            val input = userInput.text.toString()
            val inputNum = input.toInt()
            when {
                inputNum < newNumber -> {
                    result.text = "Guess something bigger"
                }
                inputNum == newNumber -> {
                    result.text = "You won the number was ${newNumber}"
                }
                else -> {
                    result.text = "Guess something smaller"
                }
            }
        }
    }

    fun generateRandomNumber(): Int {
        val numRange = arrayOf(1,2,3,4,5,6,7,8,9,10)
        //[1,2,3,4,5,6,7,8,9,10]
        val randomNumber = numRange.random()
        return randomNumber
    }

}