package com.example.sndlapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private var loginBtn:Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn = findViewById(R.id.button)

        loginBtn!!.setOnClickListener { goToNext() }
    }

    private fun goToNext() {
        var intent = Intent(this@MainActivity, Main2Activity::class.java)
        startActivity(intent)
    }
}
