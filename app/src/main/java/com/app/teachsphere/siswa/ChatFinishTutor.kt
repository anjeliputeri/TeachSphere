package com.app.teachsphere.siswa

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.app.teachsphere.R

class ChatFinishTutor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tutor_chatfinish)

        val yes = findViewById<ImageView>(R.id.ic_yes)

        yes.setOnClickListener {
            //ini yang digunakan untuk menghasilkan sebuah popup
            val builder = AlertDialog.Builder(this@ChatFinishTutor)
            builder.setTitle("Apakah kegiatan belajar telah selesai?")
            builder.setPositiveButton("IYA") { dialogInterface, i ->
                // Pindah ke halaman lain
                val intent = Intent(this@ChatFinishTutor, Registrasi::class.java)
                startActivity(intent)
            }.setNegativeButton("TIDAK") { dialogInterface, i ->
                finish()
            }.create().show()
        }
    }
}
