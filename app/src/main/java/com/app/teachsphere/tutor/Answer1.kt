package com.app.teachsphere.tutor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.app.teachsphere.R

class Answer1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer1)

        val q2 = findViewById<ImageView>(R.id.ivNextQ2)

        q2.setOnClickListener{
            val nextQ2 = Intent(this@Answer1, Question2::class.java)
            startActivity(nextQ2)
        }

        val question2 = findViewById<TextView>(R.id.tvTrue1)

        question2.setOnClickListener{
            val goQ2 = Intent(this@Answer1, Question2::class.java)
            startActivity(goQ2)
        }
    }
}