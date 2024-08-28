package com.galal.bsfproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.navigation.Navigation

class HomeFragment : Fragment() {
    private lateinit var transactioncard:CardView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        transactioncard = view.findViewById(R.id.transaction_card)
        val benefitcard:CardView=view.findViewById(R.id.benefit_card)

        transactioncard.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_transactionsFragment)
        }
        benefitcard.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_beneficiariesFragment)
        }

    }
}