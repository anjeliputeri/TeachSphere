package com.app.teachsphere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val btn = findViewById<Button>(R.id.Bmasuk)

        btn.setOnClickListener{
            val pindah = Intent(this@SignInActivity, HomeActivity::class.java)
            startActivity(pindah)
        }
    }
}