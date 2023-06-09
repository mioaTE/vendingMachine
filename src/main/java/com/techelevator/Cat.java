package com.techelevator;


public class Cat extends VendingItem{

   private String sound;


    // getters and setters
   public String getSound(){
       return sound;
   }

    // constructors
    public Cat (String slotLocation, String animalName, double price, String animalType){
        super(slotLocation, animalName, price ,animalType);
        this.sound = "Meow, Meow, Meow!";
    }
    //Methods
    public void dispense(){
       this.setQuantity(this.getQuantity() - 1);
        System.out.println(this.getSound());
    }
}
