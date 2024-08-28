package com.galal.bsfproject.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.galal.bsfproject.R
import com.galal.bsfproject.data.ActiveModel

class ActiveAdapter(private val activeList: List<ActiveModel>):RecyclerView.Adapter<ActiveAdapter.ActiveViewHolder>() {
    inner class ActiveViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var image:ImageView?=null
        var personName:TextView?=null
        var bankName:TextView?=null
        init {
            image=itemView.findViewById(R.id.person_img)
            personName=itemView.findViewById(R.id.person_name_tv)
            bankName=itemView.findViewById(R.id.bank_name_row_tv)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActiveViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.active_row,parent,false)
        return ActiveViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return activeList.size
    }

    override fun onBindViewHolder(holder: ActiveViewHolder, position: Int) {
        val item=activeList[position]
        item.image?.let { holder.image?.setImageResource(it) }
        holder.personName?.text=item.personName
        holder.bankName?.text=item.bankName
        holder.itemView.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_beneficiariesFragment_to_deleteFragment)
        }
    }

}