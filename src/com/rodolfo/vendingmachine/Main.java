package com.rodolfo.vendingmachine;

import com.rodolfo.vendingmachine.model.Product;
import com.rodolfo.vendingmachine.model.Slot;
import com.rodolfo.vendingmachine.service.Inventory;
import com.rodolfo.vendingmachine.service.VendingMachine;
import com.rodolfo.vendingmachine.service.Wallet;

public class Main{
    public static void main(String[] args) {

        //Creating Product
        Product product1 = new Product("Coca Cola");

        Slot Item1 = new Slot("A1", product1, 10, 5.00);

        Inventory inventory1 = new Inventory();

        inventory1.addSlot(Item1, "A1");

        Wallet wallet = new Wallet(4.00);

        VendingMachine machine = new VendingMachine(inventory1);

        //insert money
        machine.insertMoney(wallet);

         if(machine.buyProduct("A1")){
             System.out.println("\nProduct purchased successfully");
         }else {
             System.out.println("\nInsufficient funds");
         }

         System.out.println("Adding Money to wallet...");
         wallet.addMoney(2.00);


        if(machine.buyProduct("A1")){
            System.out.println("\nProduct purchased successfully");
        }else {
            System.out.println("\nInsufficient funds");
        }


        System.out.println("This is the balance after purchasing: $" + wallet.getBalance());




    }
}