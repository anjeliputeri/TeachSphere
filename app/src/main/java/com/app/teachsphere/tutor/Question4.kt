package com.app.teachsphere.tutor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.app.teachsphere.R

class Question4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question4)

        val tvAns4 = findViewById<TextView>(R.id.tvAnswer14)

        tvAns4.setOnClickListener{
            val goAns4 = Intent(this@Question4, Answer4::class.java)
            startActivity(goAns4)
        }
    }
}