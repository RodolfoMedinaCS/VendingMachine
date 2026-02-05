package com.rodolfo.vendingmachine.service;

import com.rodolfo.vendingmachine.model.Slot;

import java.util.HashMap;

public class Inventory {

    HashMap<String, Slot> slots = new HashMap<>();

    public void addSlot(Slot slot, String code){
        slots.put(code, slot);
    }

    public Slot getSlot(String code){
        return slots.get(code);
    }



}
