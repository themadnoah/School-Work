package com.company;

/**
 * Created by hargrnoa000 on 3/14/2016.
 */
public class BankAccounts {
    private double annualIntRate = 12.5, balance, amount;
    private int accountID;

    public BankAccounts(int accountID, double balance){
        this.accountID = accountID;
        this.balance = balance;
    }
    public double getBalance(){
        this.balance = balance;
        return balance;
    }
    public double deposit(double amount){
        balance += amount;
        return balance;
    }
    public double withdraw(double amount){
        balance -= amount;
        return balance;
    }
    public double getInterest(double annualIntRate){
        double monthlyIntRate = (annualIntRate / 100) *balance /12;
        return monthlyIntRate;
    }
}
