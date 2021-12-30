package com.example.m4l4t3

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        initViewForObject()
    }

    fun initViewForObject(){
        val obj_detail = findViewById<TextView>(R.id.detail1)
        val user = intent.getParcelableExtra<User>("user")
        Log.d(ContentValues.TAG,user.toString())

        obj_detail.text = user.toString()
    }
}