package com.rodolfo.vendingmachine.model;

public class Slot {

    public String code;
    private Product product;
    private int quantity;
    private double price;


    public Slot(String code, Product product, int quantity, double price) {
        this.code = code;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }
}
