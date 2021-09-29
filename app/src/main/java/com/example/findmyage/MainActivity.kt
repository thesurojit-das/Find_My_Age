package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buGetAge = findViewById(R.id.buGetAge) as Button
        buGetAge.setOnClickListener() {
            
           buttonclick()
    }

        /*fun buUserAgeClick(view: android.view.View) {
        val etDOB = findViewById(R.id.etDOB) as EditText
        val userDOB: Int = Integer.parseInt(etDOB.text.toString())
        val currentYear: Int = Calendar.getInstance().get(Calendar.YEAR)
        val userAgeInYears: Int = currentYear - userDOB
        val toShowAge = findViewById(R.id.toShowAge) as TextView
        toShowAge.text = "Your Age is $userAgeInYears Years"*/
    }

    fun buttonclick()
    {
        val etDOB=findViewById(R.id.etDOB) as EditText
        val userDOB:Int =Integer.parseInt(etDOB.text.toString())
        val currentYear:Int =Calendar.getInstance().get(Calendar.YEAR)
        val userAgeInYears:Int =currentYear-userDOB
        val toShowAge=findViewById(R.id.toShowAge) as TextView
        toShowAge.text = "Your Age is $userAgeInYears Years"
    }
}