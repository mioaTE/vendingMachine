package com.techelevator;


public class Duck extends VendingItem{
    // properties

    private String sound;



    // getters and setters

    public String getSound(){
        return sound;
    }


    // constructors
    public Duck (String slotLocation, String animalName, double price, String animalType){
        super(slotLocation, animalName, price   ,animalType);
        this.sound = "Quack, Quack, Splash!";

    }
    public void dispense(){
        this.setQuantity(this.getQuantity() - 1);
        System.out.println(this.getSound());
    }
}
