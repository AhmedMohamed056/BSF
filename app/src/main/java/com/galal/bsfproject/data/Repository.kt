package com.galal.bsfproject.data

class Repository {
    fun getTransactionsData() : List<TransactionModel>{
            val transactionList:List<TransactionModel> = listOf(
                TransactionModel(null,"Incoming", "2024-08-20", "50.00"),
                TransactionModel(null,"Outgoing", "2024-08-20", "100.00"),
                TransactionModel(null,"Outgoing", "2024-08-20", "150.00"),
                TransactionModel(null,"Incoming", "2024-08-20", "50.00"),
                TransactionModel(null,"Incoming", "2024-08-20", "100.00"),
                TransactionModel(null,"Outgoing", "2024-08-20", "150.00"),
                TransactionModel(null,"Incoming", "2024-08-20", "50.00"),
                TransactionModel(null,"Outgoing", "2024-08-20", "100.00"),
                TransactionModel(null,"Incoming", "2024-08-20", "150.00"),
                TransactionModel(null,"Incoming", "2024-08-20", "50.00"),
            )
        return transactionList
    }
    fun getActivePersonData():List<ActiveModel>{
        val activeList:List<ActiveModel> = listOf(
            ActiveModel(null,"Tala","BSF Bank"),
            ActiveModel(null,"Ahmad","BSF Bank"),
            ActiveModel(null,"Leen","BSF Bank"),
            ActiveModel(null,"Mohammad","BSF Bank"),
            ActiveModel(null,"Tala","BSF Bank"),
            ActiveModel(null,"Ahmad","BSF Bank"),
            ActiveModel(null,"Leen","BSF Bank")
        )
        return activeList
    }
    fun getInactivePersonData():List<ActiveModel>{
        val inactiveList:List<ActiveModel> = listOf(
            ActiveModel(null,"Mahmoud","BSF Bank"),
            ActiveModel(null,"Ahmad","BSF Bank"),
            ActiveModel(null,"Hala","BSF Bank"),
            ActiveModel(null,"Mohammad","BSF Bank"),
            ActiveModel(null,"Galal","BSF Bank"),
            ActiveModel(null,"Ahmad","BSF Bank"),
            ActiveModel(null,"Hend","BSF Bank")
        )
        return inactiveList
    }
}