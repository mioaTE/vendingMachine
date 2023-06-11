package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public abstract class VendingItem  {
    private String name;
    private double price;
    private String sound;
    private String slotID;
    private int quantity = 5;
    private boolean soldOut = false;


    // GETTERS

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String getSlotID(){
        return slotID;
    }
    public int getQuantity(){
        return quantity;
    }
    public boolean isSoldOut(){
        return soldOut;
    }

    // SETTERS

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setSlotID(String slotID){
        this.slotID = slotID;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setSoldOut(boolean soldOut){
        this.soldOut = soldOut;
    }

    // CONSTRUCTOR
    public VendingItem(String slotID,String name,double price,String type){
        this.name = name;
        this.price = price;
        this.slotID = slotID;
        this.quantity = 5;
        this.soldOut = false;
//        itemList.add;
    }

    // METHODS


    @Override
    public String toString(){
        return "Slot number: " + slotID + " | " + name + " Stuffy." + " | " + "Price: $" + price + " | " + "Quantity: " + quantity;
    }


    public void dispense(){
        quantity = this.quantity -1;

    }
}