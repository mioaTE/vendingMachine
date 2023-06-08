package com.techelevator;


public class Duck extends VendingItem{
    // properties
    private String type;



    // getters and setters
    public String getType() {
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    // constructors
    public Duck (String name, double price, String slotId, String type){
        super(name, price, slotId);
        this.type = type;
    }
}
