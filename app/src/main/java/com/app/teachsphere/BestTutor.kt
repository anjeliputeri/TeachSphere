package com.app.teachsphere

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.teachsphere.adapter.BestTutorAdapter
import com.app.teachsphere.databinding.ActivityBestTutorBinding
import com.app.teachsphere.model.TutorModel

class BestTutor : AppCompatActivity() {
    private lateinit var rvTutor: RecyclerView
    private val list = ArrayList<TutorModel>()
    private lateinit var binding: ActivityBestTutorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBestTutorBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.rvBestTutor.setHasFixedSize(true)
        list.addAll(getListBestTutor())
        showRecyclerView()
    }

    private fun showRecyclerView() {
        binding.rvBestTutor.layoutManager = LinearLayoutManager(this)
        val bestTutorAdapter = BestTutorAdapter(list)
        binding.rvBestTutor.adapter = bestTutorAdapter
    }

    private fun getListBestTutor(): Collection<TutorModel> {
        val id = resources.getStringArray(R.array.id_tutor)
        val nama = resources.getStringArray(R.array.nama_tutor)
        val alamat = resources.getStringArray(R.array.alamat_tutor)
        val harga = resources.getStringArray(R.array.harga_tutor)
        val gambar = resources.obtainTypedArray(R.array.gambar_tutor)
        val listTutor = ArrayList<TutorModel>()
        for (i in id.indices) {
            val bestTutor =
                TutorModel(id[i], nama[i], alamat[i], harga[i], gambar.getResourceId(i, -1))
            listTutor.add(bestTutor)
        }
        return listTutor

    }
}