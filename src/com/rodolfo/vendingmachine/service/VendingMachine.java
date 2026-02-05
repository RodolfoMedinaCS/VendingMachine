package com.rodolfo.vendingmachine.service;

public class VendingMachine {

    private Inventory inventory;
    private Wallet wallet;


    public VendingMachine(Inventory inventory, Wallet wallet){
        this.inventory = inventory;
        this.wallet = wallet;
    }

    public void buyProduct(String code){
        if(inventory.getSlot(code).getPrice() < wallet.getBalance()){
            wallet.setBalance(wallet.getBalance() - inventory.getSlot(code).getPrice());
            inventory.getSlot(code).setQuantity(inventory.getSlot(code).getQuantity() - 1);
        }else{
            System.out.println("Insufficient funds");
        }
    }




}
