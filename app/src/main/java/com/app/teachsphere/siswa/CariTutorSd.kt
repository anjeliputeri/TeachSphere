package com.app.teachsphere.siswa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.app.teachsphere.R

class CariTutorSd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caritutorsd)

        val goHome = findViewById<ImageView>(R.id.ivBackHome)

        goHome.setOnClickListener{
            val home = Intent(this@CariTutorSd, HomeActivity::class.java)
            startActivity(home)
        }

        val goSmp = findViewById<ImageView>(R.id.ivNextSmp)

        goSmp.setOnClickListener{
            val smp = Intent(this@CariTutorSd, CariTutorSmp::class.java)
            startActivity(smp)
        }


        val goYura = findViewById<CardView>(R.id.cdYura)

        goYura.setOnClickListener{
            val yura = Intent(this@CariTutorSd, TutorProfile::class.java)
            startActivity(yura)
        }
    }
}