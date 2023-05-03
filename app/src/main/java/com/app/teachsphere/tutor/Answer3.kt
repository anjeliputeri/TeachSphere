package com.app.teachsphere.tutor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.app.teachsphere.R

class Answer3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer3)

        val tvAns3 = findViewById<TextView>(R.id.tvTrue13)

        tvAns3.setOnClickListener{
            val goQ4 = Intent(this@Answer3, Question4::class.java)
            startActivity(goQ4)
        }
    }
}