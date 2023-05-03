package com.app.teachsphere.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.app.teachsphere.siswa.TutorProfile
import com.app.teachsphere.databinding.FragmentHomeBinding
import com.app.teachsphere.siswa.CariTutorSd
import com.app.teachsphere.siswa.CariTutorSma
import com.app.teachsphere.siswa.CariTutorSmp
import com.app.teachsphere.tutor.StartTest

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }

        var buttonToTutor : ImageView = binding.ivPhoto1
        buttonToTutor.setOnClickListener {
           activity?.let {
               val pindah = Intent(it, TutorProfile::class.java)
               it.startActivity(pindah)
           }
        }

        var imgToTest : ImageView = binding.ivHome
        imgToTest.setOnClickListener{
            activity?.let {
                val toTest = Intent(it, StartTest::class.java)
                it.startActivity(toTest)
            }
        }
        var toSd : ImageView = binding.ivSdSiswa
        toSd.setOnClickListener {
            activity?.let {
                val toSd = Intent(it, CariTutorSd::class.java)
                it.startActivity(toSd)
            }
        }
        var toSmp : ImageView = binding.ivSmpSiswa
        toSmp.setOnClickListener {
            activity?.let {
                val toSmp = Intent(it, CariTutorSmp::class.java)
                it.startActivity(toSmp)
            }
        }
        var toSma : ImageView = binding.ivSmaSiswa
        toSma.setOnClickListener {
            activity?.let {
                val toSma = Intent(it, CariTutorSma::class.java)
                it.startActivity(toSma)
            }
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}