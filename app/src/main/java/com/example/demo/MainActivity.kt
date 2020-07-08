package com.example.demo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.exercise2.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.exercise2)

        val context = this
        btnLearn.setOnClickListener {
            val intent = Intent(context, MainChangActivity::class.java)
            startActivity(intent)
        }
        btnPratice.setOnClickListener {
            val intent = Intent(context, MainChangActivity::class.java)
            startActivity(intent)
        }
        btnTest.setOnClickListener {
            val intent = Intent(context, MainChangActivity::class.java)
            startActivity(intent)
        }
        btnPratice
    }
}
