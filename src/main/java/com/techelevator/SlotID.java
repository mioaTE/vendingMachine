package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SlotID {
// PROPERTIES
    private String slotLocation;
    private String animalName;
    private double price;
    private String animalType;



    // getters and setters
    public String getSlotLocation(){
        return slotLocation;
    }

    public void setSlotLocation(String slotLocation){
        this.slotLocation = slotLocation;
    }
    public String getAnimalName(){
        return  animalName;
    }

    public void setAnimalName(String animalName){
        this.animalName = animalName;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public String getAnimalType(){
        return animalType;
    }

    public void setAnimalType(String animalType){
        this.animalType = animalType;
    }

//constructor
    public SlotID (){

    }
    // TODO METHODS MAYBE?

    public List<VendingItem> makeList() {
        String destination = "C:\\Users\\Student\\workspace\\java-minicapstonemodule1-team2\\vendingmachine.csv";
        File file = new File(destination);
        List<VendingItem> inventoryList = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String inputLine = scanner.nextLine();
                String[] word = inputLine.split("\\|");
                if(word[0].substring(0,1).equals("A")){
                    Duck duck = new Duck(word[0],word[1],Double.parseDouble(word[2]),word[3]);
                    inventoryList.add(duck);

                }else if(word[0].substring(0,1).equals("B")){
                    Penguin penguin = new Penguin(word[0],word[1],Double.parseDouble(word[2]),word[3]);
                    inventoryList.add(penguin);

                }else if(word[0].substring(0,1).equals("C")){
                    Cat cat = new Cat(word[0],word[1],Double.parseDouble(word[2]),word[3]);
                    inventoryList.add(cat);

                }else if(word[0].substring(0,1).equals("D")){
                    Pony pony = new Pony(word[0],word[1],Double.parseDouble(word[2]),word[3]);
                    inventoryList.add(pony);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(file.getName() + " could not be found");
        }

        return inventoryList;
    }
}