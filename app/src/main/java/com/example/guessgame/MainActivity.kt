package com.example.guessgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickMeButton = findViewById<TextView>(R.id.AmIRight)
        val result = findViewById<TextView>(R.id.solution)
        var number=650

        clickMeButton.setOnClickListener {
            val userNameTextInputView=findViewById<TextInputLayout>(R.id.GuessWord)
           val userName=userNameTextInputView.editText?.text?.toString()
           val userGuessing = Integer.parseInt(userName);
            val finalvalue=
                if(userGuessing > number)"No;) My Number is Smaller"
            else if(userGuessing<number)"No;) My Number is Greater "
            else "you are right!"


            result.text = "$finalvalue"


        }
    }
}