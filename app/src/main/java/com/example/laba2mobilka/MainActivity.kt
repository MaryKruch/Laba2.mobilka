package com.example.laba2mobilka

import ArmstrongNumber
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextK: EditText = findViewById(R.id.editTextK)
        val buttonFind: Button = findViewById(R.id.buttonFind)
        val textViewResult: TextView = findViewById(R.id.textViewResult)

        buttonFind.setOnClickListener {
            val k = editTextK.text.toString().toIntOrNull()
            if (k != null && k > 0) {
                val armstrongNumbers = findArmstrongNumbers(k)
                textViewResult.text = "Числа Армстронга от 1 до $k: $armstrongNumbers"
            } else {
                textViewResult.text = "Некорректное значение k"
            }
        }
    }

    private fun findArmstrongNumbers(k: Int): List<Int> {
        val armstrongNumbers = mutableListOf<Int>()
        for (num in 1..k) {
            val armstrongNumber = ArmstrongNumber(num)
            if (armstrongNumber.isArmstrong()) {
                armstrongNumbers.add(num)
            }
        }
        return armstrongNumbers
    }
}