package com.app.teachsphere.tutor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.app.teachsphere.R

class CompleteTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complete_test)

        val complete = findViewById<ImageView>(R.id.ivTrophy)

        complete.setOnClickListener{
            val goFail = Intent(this@CompleteTest, FailTest::class.java)
            startActivity(goFail)
        }
    }
}