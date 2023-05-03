package com.app.teachsphere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SigninSiswa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin_siswa)

        val register = findViewById<TextView>(R.id.register)

        register.setOnClickListener{
            val goRegis = Intent(this@SigninSiswa, registrasi::class.java)
            startActivity(goRegis)
        }
    }
}