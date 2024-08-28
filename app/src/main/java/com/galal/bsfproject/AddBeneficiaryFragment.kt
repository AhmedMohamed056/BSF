package com.galal.bsfproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.galal.bsfproject.databinding.FragmentAddBeneficiaryBinding

class AddBeneficiaryFragment : Fragment() {
    private lateinit var binding: FragmentAddBeneficiaryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentAddBeneficiaryBinding.inflate(inflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.continueBtn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_addBeneficiaryFragment_to_confirmBeneficiaryFragment)
        }
        binding.addBeneficiariesBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }

}