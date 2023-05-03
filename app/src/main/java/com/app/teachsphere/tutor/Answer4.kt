package com.app.teachsphere.tutor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.app.teachsphere.R

class Answer4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer4)

        val tvAns4 = findViewById<TextView>(R.id.tvTrue14)

        tvAns4.setOnClickListener{
            val goQ5 = Intent(this@Answer4, Question5::class.java)
            startActivity(goQ5)
        }
    }
}