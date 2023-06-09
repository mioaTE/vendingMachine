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
    //TODO SPLIT INPUTPLIST PARSE DOUBLE AND CREATE DUCK
    public Duck (String slotLocation, String animalName, double price, String animalType){
        super(slotLocation, animalName, price   ,animalType);
        this.type = type;
    }
}
