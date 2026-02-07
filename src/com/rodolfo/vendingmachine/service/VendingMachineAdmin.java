package com.rodolfo.vendingmachine.service;

import com.rodolfo.vendingmachine.model.Product;
import com.rodolfo.vendingmachine.model.Slot;

public class VendingMachineAdmin {

    private VendingMachine machine;
    private Inventory inventory;

    private static final int ROWS = 5;
    private static final int COLS = 4;

    public VendingMachineAdmin(VendingMachine machine, Inventory inventory){
        this.machine = machine;
        this.inventory = inventory;
    }
    public VendingMachineAdmin(VendingMachine machine){
        this.machine = machine;
        this.inventory = new Inventory();
    }

    public void restock(String code, int quantity){
        Slot slot = inventory.getSlot(code);
        slot.setQuantity(quantity);
    }

    public void changePrice(String code, double price){
        Slot slot = inventory.getSlot(code);
        slot.setPrice(price);
    }

    public void intilizeInventory(){
        for(char row = 'A'; row < 'A' + ROWS; row++){
            for(int col = 1; col <= COLS; col++){
                String code = row + String.valueOf(col);
                Slot slot = new Slot();
                machine.getInventory().addSlot(slot, code);
            }
        }
    }

    public void stockSlot(String productName, int qnty, double cost, String code){
        Product product = new Product(productName);
        Slot slot =  new Slot(product, qnty, cost);
        machine.getInventory().addSlot(slot,code);
    }


}
