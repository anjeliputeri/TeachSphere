package com.app.teachsphere.tutor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.app.teachsphere.R

class SertifikasiTutorSma : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sertifikatutorsma)

        val toSdTutor = findViewById<ImageView>(R.id.toSmp)

        toSdTutor.setOnClickListener{
            val goSmp = Intent(this@SertifikasiTutorSma, SertifikaTutorSmp::class.java)
            startActivity(goSmp)
        }
    }
}