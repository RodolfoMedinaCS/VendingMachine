package com.rodolfo.vendingmachine.model;

public class Slot {


    private Product product;
    private int quantity;
    private double price;


    public Slot(Product product, int quantity, double price) {

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

    public void deductQuantity(){
        this.quantity--;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
