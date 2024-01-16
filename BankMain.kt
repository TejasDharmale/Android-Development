package com.example.bankaccountprogram

fun main(){

    val tejasBankAccount = BankAccount(accountHolder = "Tejas Dharmale", balance = 1300.30)
    tejasBankAccount.deposite(200.0)
    tejasBankAccount.withdraw(1200.0)
    tejasBankAccount.deposite(1300.30)
    tejasBankAccount.transtion()
    println("${tejasBankAccount.accountHolder}'s balance is ${tejasBankAccount.balance}")

}