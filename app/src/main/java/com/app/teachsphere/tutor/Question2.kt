package com.app.teachsphere.tutor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.app.teachsphere.R

class Question2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)

        val tvAns2 = findViewById<TextView>(R.id.tvAns3)

        tvAns2.setOnClickListener{
            val goAns2 = Intent(this@Question2, Answer2::class.java)
            startActivity(goAns2)
        }
    }
}