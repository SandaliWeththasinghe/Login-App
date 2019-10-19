package com.example.sndlapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main2Activity : AppCompatActivity() {
    private var signBtn:Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        signBtn = findViewById(R.id.button3)

        signBtn!!.setOnClickListener { goToNext() }
    }
    private fun goToNext() {
        var intent = Intent(this@Main2Activity, Main3Activity::class.java)
        startActivity(intent)
    }
}
