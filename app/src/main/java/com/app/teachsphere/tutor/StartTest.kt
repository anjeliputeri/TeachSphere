package com.app.teachsphere.tutor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.app.teachsphere.R

class StartTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_test)

        val bStart = findViewById<Button>(R.id.bStart)

        bStart.setOnClickListener{
            val start = Intent(this@StartTest, Question1::class.java)
            startActivity(start)
        }
    }
}