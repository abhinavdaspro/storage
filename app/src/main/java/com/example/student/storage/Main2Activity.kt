package com.example.student.storage

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val name=findViewById<TextView>(R.id.textview1)
        val sp:SharedPreferences=getSharedPreferences("data", Context.MODE_PRIVATE)
        val s:String=sp.getString("name","failed")
        name.setText(s)
    }
}
