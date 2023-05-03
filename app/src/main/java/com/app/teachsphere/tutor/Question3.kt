package com.app.teachsphere.tutor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.app.teachsphere.R

class Question3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question3)


        val tvAns3 = findViewById<TextView>(R.id.tvAnswer13)

        tvAns3.setOnClickListener{
            val goAns3 = Intent(this@Question3, Answer3::class.java)
            startActivity(goAns3)
        }
    }
}