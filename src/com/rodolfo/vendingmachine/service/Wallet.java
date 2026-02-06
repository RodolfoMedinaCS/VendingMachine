package com.rodolfo.vendingmachine.service;

public class Wallet {

    private double balance;

    public Wallet(double balance) {
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void deductPrice(double price){
        this.balance -= price;
    }

    public void addMoney(double cash){
        this.balance += cash;
    }
}
