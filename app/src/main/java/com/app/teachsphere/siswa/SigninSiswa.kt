package com.app.teachsphere.siswa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.app.teachsphere.R

class SigninSiswa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin_siswa)

        val register = findViewById<TextView>(R.id.register)

        register.setOnClickListener{
            val goRegis = Intent(this@SigninSiswa, Registrasi::class.java)
            startActivity(goRegis)
        }
    }
}