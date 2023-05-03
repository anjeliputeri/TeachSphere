package com.app.teachsphere.tutor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.app.teachsphere.R

class Answer5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer5)

        val tvAns5 = findViewById<TextView>(R.id.tvAns5)

        tvAns5.setOnClickListener{
            val goComplete = Intent(this@Answer5, CompleteTest::class.java)
            startActivity(goComplete)
        }
    }
}