package com.app.teachsphere.siswa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.app.teachsphere.R

class ChatTutorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.siswa_chat)

        val chatFinish = findViewById<TextView>(R.id.tvYatutor)

        chatFinish.setOnClickListener {
            val goFinish = Intent(this@ChatTutorActivity, ChatFinishTutor::class.java)
            startActivity(goFinish)
        }
    }
}