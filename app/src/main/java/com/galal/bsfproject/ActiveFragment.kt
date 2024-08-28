package com.galal.bsfproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.galal.bsfproject.adapters.ActiveAdapter
import com.galal.bsfproject.data.Repository
import com.galal.bsfproject.databinding.FragmentActiveBinding

class ActiveFragment : Fragment() {
    private lateinit var binding:FragmentActiveBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentActiveBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpActiveAdapter()
    }

    private fun setUpActiveAdapter() {
        binding.activeRecyclerview.layoutManager=LinearLayoutManager(context)
        val data=Repository().getActivePersonData()
        val myAdapter=ActiveAdapter(data)
        binding.activeRecyclerview.adapter=myAdapter
    }


}