package com.app.teachsphere.tutor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.app.teachsphere.R

class Answer2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer2)

        val q3 = findViewById<TextView>(R.id.tvTrue3)

        q3.setOnClickListener{
            val goQ3 = Intent(this@Answer2, Question3::class.java)
            startActivity(goQ3)
        }

    }
}