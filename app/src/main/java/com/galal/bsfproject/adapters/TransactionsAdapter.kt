package com.galal.bsfproject.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.galal.bsfproject.R
import com.galal.bsfproject.data.TransactionModel

class TransactionsAdapter(private val transactionsList: List<TransactionModel>) :
    RecyclerView.Adapter<TransactionsAdapter.TransactionViewHolder>() {

    // inflates a layout file and returns a new instance of MyViewHolder class
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.transaction_row, parent, false)
        return TransactionViewHolder(itemView)
    }

    // returns the size of the data set
    override fun getItemCount(): Int {
        return transactionsList.size
    }

    // binds data to the views in the MyViewHolder
    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        val transactionItem = transactionsList[position]
        holder.bind(transactionItem)

    }

    class TransactionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.status_row_img)
        private val statusTv: TextView = itemView.findViewById(R.id.outgoing_tv)
        private val dateTv: TextView = itemView.findViewById(R.id.date_row_tv)
        private val moneyTv: TextView = itemView.findViewById(R.id.money_row_tv)

        @SuppressLint("SetTextI18n")
        fun bind(transaction: TransactionModel) {
            statusTv.text = transaction.status
            dateTv.text = transaction.date
//            moneyTv.text = transaction.money
//            transaction.image?.let { imageView.setImageResource(it) }
            when(transaction.status){
                "Outgoing"->{//imageView.setImageResource(R.drawable.outgoing_ic)
                moneyTv.text="-${transaction.money} SAR"}
                "Incoming"->{imageView.setImageResource(R.drawable.income_ic)
                moneyTv.text="+${transaction.money} SAR"}
            }


        }
    }
}