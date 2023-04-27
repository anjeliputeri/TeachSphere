package com.app.teachsphere.ui.tutor

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

internal class DetailMentorViewPager(var context: Context, fm: FragmentManager, var totalTabs: Int): FragmentPagerAdapter(fm){
    override fun getCount(): Int {
        return totalTabs
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> {
                DataPribadiFragment()
            }

            1 -> {
                PendidikanFragment()
            }

            2 -> {
                PengalamanFragment()
            }
            else -> {
                getItem(position)
            }
        }
    }


}