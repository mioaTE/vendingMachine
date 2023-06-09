package com.techelevator;

public class Pony extends VendingItem{

    private String sound;

    public String getSound(){
        return sound;
    }

    // constructors
    public Pony (String slotLocation, String animalName, double price, String animalType){
        super(slotLocation, animalName, price   ,animalType);
        this.sound = "Neigh, Neigh, Yay!";
    }
    public void dispense(){
        this.setQuantity(this.getQuantity() - 1);
        System.out.println(this.getSound());
    }
}
