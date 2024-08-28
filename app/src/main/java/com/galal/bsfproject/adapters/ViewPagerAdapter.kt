package com.galal.bsfproject.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.galal.bsfproject.ActiveFragment
import com.galal.bsfproject.BeneficiariesFragment
import com.galal.bsfproject.InactiveFragment

class ViewPagerAdapter(fragmentManager: BeneficiariesFragment):FragmentStateAdapter(fragmentManager){
    private val fragments= listOf(ActiveFragment(),InactiveFragment())
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}