package com.app.teachsphere.tutor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.app.teachsphere.R

class Question5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question5)

        val tvAns5 = findViewById<TextView>(R.id.tvAnswer15)

        tvAns5.setOnClickListener{
            val goAns5 = Intent(this@Question5, Answer5::class.java)
            startActivity(goAns5)
        }
    }
}