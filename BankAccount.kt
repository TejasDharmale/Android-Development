package com.example.bankaccountprogram

class BankAccount(var accountHolder:String, var balance: Double) {
    private val transaction = mutableListOf<String>()

    fun deposite(amount: Double){
        balance += amount
        transaction.add("$accountHolder deposited $$amount")

    }
    fun withdraw(amount: Double){
        if(amount<=balance){
            balance-= amount
            println("$accountHolder withdraw $$amount")

        }
        else{
            println("u don't have the fund $$amount")
        }
    }
    fun transtion(){
        println("Transation history for $accountHolder")
        for (transtion in transaction)
        {
            println(transtion)
        }

    }

}