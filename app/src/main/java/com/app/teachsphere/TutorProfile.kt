package com.app.teachsphere

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.app.teachsphere.ui.tutor.DetailMentorViewPager
import com.google.android.material.tabs.TabLayout

class TutorProfile : AppCompatActivity() {

    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutor_profile)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewpager)

        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_baseline_person_24))
        tabLayout.getTabAt(0)!!.setText("Data Diri")
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.pendidikan))
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.pengalaman))
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.keterampilan))


        val adapter = DetailMentorViewPager(this, supportFragmentManager, tabLayout.tabCount)
        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager.currentItem = tab!!.position
                if(tab!!.position == 0){
                    tabLayout.getTabAt(0)!!.setText("Data Diri")
                }else if(tab!!.position == 1){
                    tabLayout.getTabAt(1)!!.setText("Pendidikan")

                }else if(tab!!.position == 2){
                    tabLayout.getTabAt(2)!!.setText("Pengalaman")

                }else if(tab!!.position == 3){
                    tabLayout.getTabAt(3)!!.setText("Keterampilan")

                }

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                tabLayout.getTabAt(tab!!.position)!!.setText("")

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })
    }
}