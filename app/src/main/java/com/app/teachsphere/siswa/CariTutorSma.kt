package com.app.teachsphere.siswa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.app.teachsphere.R

class CariTutorSma : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caritutorsma)

        val goSmp = findViewById<ImageView>(R.id.ivBackSmp)

        goSmp.setOnClickListener{
            val smp = Intent(this@CariTutorSma, CariTutorSmp::class.java)
            startActivity(smp)
        }

    }
}