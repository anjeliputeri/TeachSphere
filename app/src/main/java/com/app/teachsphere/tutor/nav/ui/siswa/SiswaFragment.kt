package com.app.teachsphere.tutor.nav.ui.siswa

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.app.teachsphere.databinding.FragmentSiswaBinding
import com.app.teachsphere.siswa.ChatTutorActivity
import com.app.teachsphere.tutor.ChatSiswaActivity

class SiswaFragment : Fragment() {

    private var _binding: FragmentSiswaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(SiswaViewModel::class.java)

        _binding = FragmentSiswaBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textHome
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        var goTutor : ImageView = binding.iv2
        goTutor.setOnClickListener {
            activity?.let {
                val pindah = Intent(it, ChatSiswaActivity::class.java)
                it.startActivity(pindah)
            }
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}