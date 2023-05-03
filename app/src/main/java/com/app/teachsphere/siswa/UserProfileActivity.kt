package com.app.teachsphere.siswa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.app.teachsphere.R

class UserProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        val goSign = findViewById<Button>(R.id.bLanjut)

        goSign.setOnClickListener{
            val sign = Intent(this@UserProfileActivity, HomeActivity::class.java)
            startActivity(sign)
        }

        val goSignIn = findViewById<ImageView>(R.id.ivNextHome)

        goSignIn.setOnClickListener{
            val signIn = Intent(this@UserProfileActivity, HomeActivity::class.java)
            startActivity(signIn)
        }
    }
}