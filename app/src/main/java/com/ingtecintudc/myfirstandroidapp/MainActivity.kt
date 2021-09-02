package com.ingtecintudc.myfirstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<EditText>(R.id.id_name)
        val ageInput = findViewById<EditText>(R.id.id_age)
        val numberButton = findViewById<Button>(R.id.numberButton)


        numberButton.setOnClickListener() {


            if (nameInput.text.isEmpty() || ageInput.text.isEmpty()) {
                Toast.makeText(this, "Complete all inputs please", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            val luckyNumber: Int = (ageInput.text.toString()).toInt()

            if (luckyNumber > 0 && luckyNumber < 10) {
                var aux = luckyNumber
                var multiplicated = aux * 7
                var result = 0
                while (aux > 0) {
                    result = result + multiplicated % 10
                    aux = aux / 10
                }
                Toast.makeText(
                    this,
                    "Hello ${nameInput.text} your lucky number is: $result",
                    Toast.LENGTH_LONG
                ).show()
                return@setOnClickListener
            }else {
                var aux = luckyNumber
                var multiplicated = aux * 1
                var result = 0
                while (aux > 0) {
                    result = result + multiplicated % 10
                    aux = aux / 10
                }
                Toast.makeText(
                    this,
                    "Hello ${nameInput.text} your lucky number is: $result",
                    Toast.LENGTH_LONG
                ).show()
                return@setOnClickListener
            }



        }
    }
}
