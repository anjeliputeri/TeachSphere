package com.app.teachsphere.siswa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.app.teachsphere.R
import com.app.teachsphere.tutor.nav.HomeTutorActivity

class Registrasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)

        val siswa = findViewById<RadioButton>(R.id.rb_siswa)
        val tutor = findViewById<RadioButton>(R.id.rb_tutor)

        siswa.setOnClickListener{
            val goSiswa = Intent(this@Registrasi, UserProfileActivity::class.java)
            startActivity(goSiswa)
        }

        tutor.setOnClickListener{
            val goTutor = Intent(this@Registrasi, HomeTutorActivity::class.java)
            startActivity(goTutor)
        }
    }
}