package com.rodolfo.vendingmachine.service;

import com.rodolfo.vendingmachine.model.Slot;

public class VendingMachine {

    private Inventory inventory;
    private Wallet wallet;


    public VendingMachine(){
        this.inventory = new Inventory();
    }

    public boolean buyProduct(String code){
        Slot slot = inventory.getSlot(code);
        double price = slot.getPrice();

        if(price <= wallet.getBalance()) {
            wallet.deductPrice(price);
            slot.deductQuantity();
            return true;
        }
        return false;
    }

    public void insertMoney(Wallet money){
        wallet = money;
    }





}
