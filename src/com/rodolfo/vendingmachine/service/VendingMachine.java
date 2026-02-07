package com.rodolfo.vendingmachine.service;

import com.rodolfo.vendingmachine.model.Slot;

public class VendingMachine {

    private Inventory inventory;
    private Wallet wallet;


    public VendingMachine(){
        this.inventory = new Inventory();
        this.wallet = new Wallet();
    }


    public boolean buyProduct(String code){
        Slot slot = inventory.getSlot(code);
        double price = slot.getPrice();
        System.out.println(wallet.getBalance());
        System.out.println(price);

        if(price <= wallet.getBalance()) {
            wallet.deductPrice(price);
            slot.deductQuantity();
            return true;
        }
        return false;
    }

    public void insertMoney(double money){
        wallet.addMoney(money);
    }

    public Inventory getInventory(){
        return inventory;
    }





}
