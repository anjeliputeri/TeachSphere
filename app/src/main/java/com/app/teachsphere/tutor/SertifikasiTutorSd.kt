package com.app.teachsphere.tutor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.app.teachsphere.R
import com.app.teachsphere.siswa.HomeActivity

class SertifikasiTutorSd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sertifikasitutorsd)

        val toSmpTutor = findViewById<ImageView>(R.id.ivSmpTutor)

        toSmpTutor.setOnClickListener{
            val goSmp = Intent(this@SertifikasiTutorSd, SertifikaTutorSmp::class.java)
            startActivity(goSmp)
        }

        val toHomeTutor = findViewById<ImageView>(R.id.ivHomeTutor)

        toHomeTutor.setOnClickListener{
            val goHome = Intent(this@SertifikasiTutorSd, HomeActivity::class.java)
            startActivity(goHome)
        }

        val toTest = findViewById<Button>(R.id.bTest)

        toTest.setOnClickListener{
            val goTest = Intent(this@SertifikasiTutorSd, StartTest::class.java)
            startActivity(goTest)
        }
    }
}