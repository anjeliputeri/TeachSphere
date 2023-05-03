package com.app.teachsphere.ui.ChatTutor

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.app.teachsphere.databinding.FragmentDashboardBinding
import com.app.teachsphere.siswa.ChatTutorActivity
import com.app.teachsphere.siswa.TutorProfile

class ChatTutorFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val chatTutorViewModel =
            ViewModelProvider(this).get(ChatTutorViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textChat
//        chatTutorViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }

        var goChat : ImageView = binding.imageView2
        goChat.setOnClickListener {
            activity?.let {
                val pindah = Intent(it, ChatTutorActivity::class.java)
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