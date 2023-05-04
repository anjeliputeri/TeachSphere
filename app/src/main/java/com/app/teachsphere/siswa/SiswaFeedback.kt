package com.app.teachsphere.siswa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.app.teachsphere.R

class SiswaFeedback : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.siswa_feedback)

        val feedback = findViewById<ImageView>(R.id.suka_button)

        feedback.setOnClickListener{
            val goProfile = Intent(this@SiswaFeedback, HomeActivity::class.java)
            startActivity(goProfile)
        }
    }
}