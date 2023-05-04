package com.app.teachsphere.tutor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.app.teachsphere.R

class ChatSiswaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tutor_chat)

        val chatFinish = findViewById<TextView>(R.id.tvYa)

        chatFinish.setOnClickListener {
            val goFinish = Intent(this@ChatSiswaActivity, ChatFinishSiswa::class.java)
            startActivity(goFinish)
        }
    }
}