package com.app.teachsphere.tutor.nav.ui.beranda

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.app.teachsphere.databinding.FragmentBerandaTutorBinding
import com.app.teachsphere.tutor.SertifikasiTutorSd

class BerandaTutorFragment : Fragment() {

    private var _binding: FragmentBerandaTutorBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(BerandaTutorViewModel::class.java)

        _binding = FragmentBerandaTutorBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textDashboard
//        dashboardViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }

        var toTest : TextView = binding.tvPilih
        toTest.setOnClickListener {
            activity?.let {
                val toPilih = Intent(it, SertifikasiTutorSd::class.java)
                it.startActivity(toPilih)
            }
        }

        var toTes : ImageView = binding.ivSdTutor
        toTes.setOnClickListener {
            activity?.let {
                val toSd = Intent(it, SertifikasiTutorSd::class.java)
                it.startActivity(toSd)
            }
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}