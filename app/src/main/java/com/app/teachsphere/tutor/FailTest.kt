package com.app.teachsphere.tutor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.app.teachsphere.R
import com.app.teachsphere.tutor.nav.HomeTutorActivity

class FailTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fail_test)

        val toHome = findViewById<Button>(R.id.bKembali)

        toHome.setOnClickListener{
            val goKembali = Intent(this@FailTest, HomeTutorActivity::class.java)
            startActivity(goKembali)
        }
    }
}