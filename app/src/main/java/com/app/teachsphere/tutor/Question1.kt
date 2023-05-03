package com.app.teachsphere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.app.teachsphere.tutor.StartTest

class Question1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question1)

        val ans1 = findViewById<TextView>(R.id.tvAnswer11)

        ans1.setOnClickListener{
            val ansOne = Intent(this@Question1, Answer1::class.java)
            startActivity(ansOne)
        }

        val backStart = findViewById<ImageView>(R.id.ivBStart)

        backStart.setOnClickListener{
            val bStart = Intent(this@Question1, StartTest::class.java)
            startActivity(bStart)
        }
    }
}