package com.rodolfo.vendingmachine;

import com.rodolfo.vendingmachine.model.Product;
import com.rodolfo.vendingmachine.model.Slot;
import com.rodolfo.vendingmachine.service.Inventory;
import com.rodolfo.vendingmachine.service.VendingMachine;
import com.rodolfo.vendingmachine.service.VendingMachineAdmin;
import com.rodolfo.vendingmachine.service.Wallet;

public class Main{
    public static void main(String[] args) {



        VendingMachine machine1 = new VendingMachine();

        //admin work
        VendingMachineAdmin admi1 = new VendingMachineAdmin(machine1);






    }
}