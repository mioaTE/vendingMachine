package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {


    List<VendingItem> itemList; // List of available products to purchase
    public double amountOfMoneyStored; // Change to give back stored in the machine
    private double balanceInserted; // The amount of money inserted by the user
    private double balanceRequired; // The amount of money required to purchase a VendingItem
    private TransactionLog transactionLog; // Stores the transactions that occur

    public VendingMachine(List itemList, double balanceInserted, double balanceRequired, TransactionLog transactionLog) throws FileNotFoundException {
        this.itemList = new ArrayList<>();
        this.balanceInserted = balanceInserted;
        this.balanceRequired = 0.0;
        this.amountOfMoneyStored = 100.0;
//        this.transactionLog +=;
    }

    public void addItem(VendingItem item) {
        itemList.add(item);
    }

//    public static void displayItems() {
//        for (VendingItem item : itemList) {
//            System.out.println(item.getSlotID() + " | " + item.getName() + " | " + " | $" + item.getPrice());
//        }
//    }

//    public void dispense() {
//        if (soldOut || quantity < 0) {
//            System.out.println("SOLD OUT");
//            return;
//        }
//    }

    public static void main(String[] args) {
        String destination = "C:/Users/Student/workspace/java-minicapstonemodule1-team2/VendingMachine/VendingMachineProgram/vendingmachine.csv";
        File file = new File(destination);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String inputLine = scanner.nextLine();
                inputLine.split("\\|");
                String[] newLine = addItems(inputLine);


//            String newLine = convertText(inputLine.split);

//            inputLine.split("\\|");

            }
        } catch (FileNotFoundException e) {
            System.out.println(file.getName() + " could not be found");
        }
    }
    public void addItems(String inputLine){
        String[] words = inputLine.split("\\|");
        String result = "";
        for (String word : words){
            if(word.length() == 2){
                if(word.substring(0,1).equals("A")){

                }
            }
        }


//    private String convertText(String )

}

}
