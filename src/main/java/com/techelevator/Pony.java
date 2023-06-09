package com.techelevator;

public class Pony extends VendingItem{

    private String type;


    // getters and setters
    public String getType() {
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    // constructors
    public Pony (String slotLocation, String animalName, double price, String animalType){
        super(slotLocation, animalName, price   ,animalType);
        this.type = type;
    }
}
