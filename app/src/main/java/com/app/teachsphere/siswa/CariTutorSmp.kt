package com.app.teachsphere.siswa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.app.teachsphere.R

class CariTutorSmp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caritutorsmp)

        val goSd = findViewById<ImageView>(R.id.ivBackSd)

        goSd.setOnClickListener{
            val sd = Intent(this@CariTutorSmp, CariTutorSd::class.java)
            startActivity(sd)
        }

        val goSma = findViewById<ImageView>(R.id.ivNextSma)

        goSma.setOnClickListener{
            val sma = Intent(this@CariTutorSmp, CariTutorSma::class.java)
            startActivity(sma)
        }
    }
}