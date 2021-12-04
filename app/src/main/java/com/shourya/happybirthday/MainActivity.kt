package com.shourya.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val response = findViewById<Button>(R.id.Button)
        var number = 0
        response.setOnClickListener{
            number++
            Toast.makeText(this,"Push Harder $number",Toast.LENGTH_SHORT).show()
            if (number == 5) {
                Toast.makeText(this, "Better luck next time", Toast.LENGTH_SHORT).show()
                number = 0
            }
        }
    }
}