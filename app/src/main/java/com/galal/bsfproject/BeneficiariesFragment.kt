package com.galal.bsfproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.navigation.Navigation
import com.galal.bsfproject.adapters.ViewPagerAdapter
import com.galal.bsfproject.databinding.FragmentBeneficiariesBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class BeneficiariesFragment : Fragment() {
    private lateinit var binding: FragmentBeneficiariesBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding=FragmentBeneficiariesBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager()
        binding.addNewBenefCard.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_beneficiariesFragment_to_addBeneficiaryFragment)
        }
        binding.beneficiariesBack.setOnClickListener {
            Navigation.findNavController(view).navigateUp()
        }

    }


    private fun setupViewPager() {
        val adapter=ViewPagerAdapter(this@BeneficiariesFragment)
        binding.viewPager.adapter=adapter
        TabLayoutMediator(binding.tabLayout,binding.viewPager){tab,position->
            when(position){
                0->tab.text="Active"
                else->tab.text="Inactive"
            }
        }.attach()

    }
}