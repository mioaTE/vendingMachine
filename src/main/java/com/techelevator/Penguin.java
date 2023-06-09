package com.techelevator;


public class Penguin extends VendingItem{
    private String sound;

    public String getSound(){
        return sound;
    }

    // constructors
    public Penguin (String slotLocation, String animalName, double price, String animalType){
        super(slotLocation, animalName, price   ,animalType);
        this.sound =  "Squawk, Squawk, Whee!";
    }
    public void dispense(){
        this.setQuantity(this.getQuantity() - 1);
        System.out.println(this.getSound());
    }
}
