package com.app.teachsphere.tutor.nav.ui.profile

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.app.teachsphere.R
import com.app.teachsphere.databinding.FragmentProfileTutorBinding
import com.app.teachsphere.siswa.HomeActivity
import com.app.teachsphere.tutor.nav.HomeTutorActivity
import com.app.teachsphere.ui.tutor.DetailMentorViewPager
import com.google.android.material.tabs.TabLayout

class ProfileTutorFragment : Fragment() {

    private var _binding: FragmentProfileTutorBinding? = null

    lateinit var viewPager: ViewPager
    lateinit var iHome: ImageView
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(ProfileTutorViewModel::class.java)

        _binding = FragmentProfileTutorBinding.inflate(inflater, container, false)
        val root: View = binding.root

        var tabLayout : TabLayout = binding.tabLayout
        var viewPager : ViewPager = binding.viewpager
        var iHome : ImageView = binding.ivHomeSiswa

        iHome.setOnClickListener{
            activity?.let {
                val goHome = Intent(it, HomeTutorActivity::class.java)
                startActivity(goHome)
            }
        }

        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_baseline_person_24))
//        tabLayout.getTabAt(0)!!.setText("Data Diri")
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.pendidikan))
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.pengalaman))
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.keterampilan))

        val adapter = activity?.let { DetailMentorViewPager(it.applicationContext, it.supportFragmentManager, tabLayout.tabCount) }
        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager.currentItem = tab!!.position
//                if(tab!!.position == 0){
//                    tabLayout.getTabAt(0)!!.setText("Data Diri")
//                }else if(tab!!.position == 1){
//                    tabLayout.getTabAt(1)!!.setText("Pendidikan")
//
//                }else if(tab!!.position == 2){
//                    tabLayout.getTabAt(2)!!.setText("Pengalaman")
//
//                }else if(tab!!.position == 3){
//                    tabLayout.getTabAt(3)!!.setText("Keterampilan")

//                }

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                tabLayout.getTabAt(tab!!.position)!!.setText("")

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}