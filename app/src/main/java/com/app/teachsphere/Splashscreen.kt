package com.app.teachsphere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.app.teachsphere.siswa.SigninSiswa

class Splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        var handler = Handler()
        handler.postDelayed({
            var intent = Intent(this, SigninSiswa::class.java)
            startActivity(intent)
            finish()
        }, 4000)
    }
}