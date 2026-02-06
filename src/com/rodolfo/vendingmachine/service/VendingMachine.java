package com.rodolfo.vendingmachine.service;

import com.rodolfo.vendingmachine.model.Slot;

public class VendingMachine {

    private static final int ROWS = 5;
    private static final int COLS = 4;




    private Inventory inventory;
    private Wallet wallet;


    public VendingMachine(Inventory inventory){
        this.inventory = inventory;
    }

    private void intilizeInventory(){
        for(char row = 'A'; row < 'A' + ROWS; row++){
            for(int col = 1; col <= COLS; col++){
                String code = row + String.valueOf(col);
                inventory.addSlot(null, code);
            }
        }
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
