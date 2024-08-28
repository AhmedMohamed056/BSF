package com.galal.bsfproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.galal.bsfproject.R
import com.galal.bsfproject.adapters.TransactionsAdapter
import com.galal.bsfproject.data.Repository
import com.galal.bsfproject.databinding.FragmentTransactionsBinding

class TransactionsFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var binding: FragmentTransactionsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentTransactionsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.transactionBack.setOnClickListener {
            findNavController().navigateUp()
        }
        //recyclerView = view.findViewById(R.id.transaction_recyclerview)
        setUpTransactionAdapter()
    }

    private fun setUpTransactionAdapter() {
        binding.transactionRecyclerview.layoutManager = LinearLayoutManager(context)

        val data = Repository().getTransactionsData()
        val myAdapter = TransactionsAdapter(data)
        binding.transactionRecyclerview.adapter = myAdapter

    }

}