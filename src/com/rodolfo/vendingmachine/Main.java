package com.rodolfo.vendingmachine;

import com.rodolfo.vendingmachine.service.VendingMachine;
import com.rodolfo.vendingmachine.service.VendingMachineAdmin;
import com.rodolfo.vendingmachine.service.Wallet;

public class Main{
    public static void main(String[] args) {



        VendingMachine machine1 = new VendingMachine();

        //admin work ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        VendingMachineAdmin admin1 = new VendingMachineAdmin(machine1);

        admin1.intilizeInventory();

        admin1.stockSlot("Flamin Hot Cheetos", 3, 2.50, "A1");


        //admin work ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        //Customer~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        machine1.insertMoney(1.00);

        if(machine1.buyProduct("A1")){
            System.out.println("Purchased A1 Product");
        }else{
            System.out.println("Not enough funds");
        }













    }
}