package com.techelevator;


import jdk.swing.interop.SwingInterOpUtils;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        SlotID slotID = new SlotID();
        List<VendingItem> itemList = slotID.makeList();
        VendingMachine vendingMachine = new VendingMachine();
        TransactionLog logs = new TransactionLog();


        boolean exit = false; // Initializes the exit variable to false to control the loop
        Scanner userInput = new Scanner(System.in);

        while (!exit) { // Starts a loop that continues until the user chooses to exit
            System.out.println("Welcome to the Vendo-Matic 800!\n");
            System.out.println("Main Menu:");
            System.out.println("(1) Display Vending Machine Items");
            System.out.println("(2) Purchase");
            System.out.println("(3) Exit");

            System.out.print("\nPlease enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            String choice = userInput.nextLine();
            scanner.nextLine(); // Consume the newline character after reading the choice


            if (choice.equals("1")) {
                for(VendingItem item : itemList){
                    System.out.println(item);
                }

            } else if (choice.equals("2") ) {
                boolean menu2Exit = false;
                while(!menu2Exit) {
                    System.out.println();
                    System.out.println("Current Balance: " + vendingMachine.getBalanceInserted());
                    System.out.println();
                    System.out.println("(1) Feed Money");
                    System.out.println("(2) Select Product");
                    System.out.println("(3) Finish Transaction");

                    System.out.print("\nPlease enter your choice: \n");
                    choice = userInput.nextLine();

                    if (choice.equals("1")) {
                        //TODO FIX NULL POINTER WHEN TRYING TO RUN LOGS.ADDITEM
                        vendingMachine.FeedMoney();
                        //System.out.println(LocalDateTime.now() + " FEED MONEY: " + "$1.00 " + "$" + vendingMachine.getBalanceInserted() + "0");
                        String Line = LocalDateTime.now() + " FEED MONEY: " + "$1.00 " + "$" + vendingMachine.getBalanceInserted() + "0";
                       //TODO MAKE WORK logs.addItem(Line);
                        //TODO MAKE WORK logs.makeFile();
                    } else if (choice.equals("2")) {
                        for(VendingItem item : itemList) {
                            System.out.println(item);
                        }
                        System.out.print("Choose item: \n");
                        String itemPicked = userInput.nextLine();
                        for (VendingItem item : itemList) {
                            if (item.getSlotID().equals(itemPicked)) {
                                if (item.getPrice() <= vendingMachine.getBalanceInserted()) {
                                    if(item.getQuantity() == 0){
                                        System.out.println("this item is SOLD OUT.");
                                    } else {
                                    double balance = vendingMachine.getBalanceInserted();
                                    balance = vendingMachine.getBalanceInserted() - item.getPrice();
                                    BigDecimal.valueOf(balance);
                                    vendingMachine.setBalanceInserted(balance);
                                    System.out.println();

                                        System.out.println("You have purchased a: " + item.getName() + " for the price of: $" + item.getPrice());
                                        System.out.println();
                                        item.dispense();
                                        System.out.println("there are " + item.getQuantity() + " " + item.getName() + " left!");
                                        System.out.println("Balance left: $" + balance);
                                    }
                                }

                            }
                        }
                    } else if (choice.equals("3")) {
                        System.out.println("Change received: $" + vendingMachine.getBalanceInserted());
                        double balance = vendingMachine.getBalanceInserted();
                        int quarters = 0;
                        int dimes = 0;
                        int nickles = 0;

                        do {
                            if (balance >= 0.25) {
                                balance -= 0.25;
                                quarters++;
                            } else if (balance >= 0.10) {
                                balance -= 0.10;
                                dimes++;
                            } else {
                                balance -= 0.05;
                                nickles++;
                            }


                        } while (balance > 0.05);
                        System.out.println("Don't forget your change! " + "Quarters: " + quarters + "\\|" +" Dimes: " + dimes + "\\|" + " Nickels: " + nickles);
                        System.out.println();
                        menu2Exit = true;

                    }
                }


            } else if (choice.equals("3")) {
                // Exit the program
                System.out.println("\nThank you for using Vendo-Matic 800. Have a great day!");
                exit = true;
            } else {
                // Invalid choice entered
                System.out.println("\nInvalid choice. Please try again.\n");
            }
        }
    }
}
//TODO ADD UNIT TESTING

