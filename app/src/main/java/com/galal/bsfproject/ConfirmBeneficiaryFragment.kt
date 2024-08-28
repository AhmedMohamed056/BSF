package com.galal.bsfproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.galal.bsfproject.databinding.FragmentConfirmBeneficiaryBinding


class ConfirmBeneficiaryFragment : Fragment() {
    private lateinit var binding: FragmentConfirmBeneficiaryBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentConfirmBeneficiaryBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.confirmBtn.setOnClickListener {
        }
        binding.confBenefBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }

}