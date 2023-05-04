package com.app.teachsphere.tutor

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
import com.app.teachsphere.siswa.Registrasi
import com.app.teachsphere.tutor.nav.HomeTutorActivity
import com.app.teachsphere.tutor.nav.ui.siswa.SiswaFragment

class ChatFinishSiswa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.siswa_chatfinish)

        val yes = findViewById<ImageView>(R.id.ic_finish)

        yes.setOnClickListener {
            //ini yang digunakan untuk menghasilkan sebuah popup
            val builder = AlertDialog.Builder(this@ChatFinishSiswa)
            builder.setTitle("Apakah kegiatan belajar telah selesai?")
            builder.setPositiveButton("IYA") { dialogInterface, i ->
                // Pindah ke halaman lain
                val intent = Intent(this@ChatFinishSiswa, HomeTutorActivity::class.java)
                startActivity(intent)
            }.setNegativeButton("TIDAK") { dialogInterface, i ->
                finish()
            }.create().show()
        }
    }
}
