package com.galal.bsfproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.galal.bsfproject.adapters.ActiveAdapter
import com.galal.bsfproject.data.Repository
import com.galal.bsfproject.databinding.FragmentInactiveBinding

class InactiveFragment : Fragment() {
    private lateinit var binding:FragmentInactiveBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentInactiveBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpActiveAdapter()
    }

    private fun setUpActiveAdapter() {
        binding.inactiveRecyclerview.layoutManager= LinearLayoutManager(context)
        val data= Repository().getInactivePersonData()
        val myAdapter= ActiveAdapter(data)
        binding.inactiveRecyclerview.adapter=myAdapter
    }

}