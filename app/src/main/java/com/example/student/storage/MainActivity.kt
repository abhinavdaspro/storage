package com.example.student.storage

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edittext=findViewById<EditText>(R.id.edit1)
        val but1=findViewById<Button>(R.id.button1)
        val sp:SharedPreferences=getSharedPreferences("data", Context.MODE_PRIVATE)
        val editor:SharedPreferences.Editor=sp.edit()
        
        but1.setOnClickListener{
            editor.putString("name",edittext.text.toString())
            editor.apply()

            startActivity(Intent(this,Main2Activity::class.java))

        }
    }
}
