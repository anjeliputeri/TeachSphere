package com.app.teachsphere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.app.teachsphere.R
import com.app.teachsphere.tutor.Question2

class Answer1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer1)

        val q2 = findViewById<ImageView>(R.id.ivNextQ2)

        q2.setOnClickListener{
            val nextQ2 = Intent(this@Answer1, Question2::class.java)
            startActivity(nextQ2)
        }
    }
}