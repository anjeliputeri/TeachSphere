package com.app.teachsphere.tutor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.app.teachsphere.R

class SertifikaTutorSmp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sertifikatutorsmp)

        val toSdTutor = findViewById<ImageView>(R.id.toSdBack)

        toSdTutor.setOnClickListener{
            val goSd = Intent(this@SertifikaTutorSmp, SertifikasiTutorSd::class.java)
            startActivity(goSd)
        }

        val toSmaTutor = findViewById<ImageView>(R.id.toSma)

        toSmaTutor.setOnClickListener{
            val goSma = Intent(this@SertifikaTutorSmp, SertifikasiTutorSma::class.java)
            startActivity(goSma)
        }
    }
}