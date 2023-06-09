package com.techelevator;


import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        SlotID slotID = new SlotID();
        List<VendingItem> itemList = slotID.makeList();
        VendingMachine vendingMachine = new VendingMachine();

        //displayMainMenu();
        boolean exit = false; // Initializes the exit variable to false to control the loop
        Scanner userInput = new Scanner(System.in);

        while (!exit) { // Starts a loop that continues until the user chooses to exit
            System.out.println("Welcome to the Vendo-Matic 800!\n");
            System.out.println("Main Menu:");
            System.out.println("(1) Display Vending Machine Items");
            System.out.println("(2) Add $1.00");
            System.out.println("(3) Exit");

            System.out.print("\nPlease enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            String choice = userInput.nextLine();
//            System.out.println(choice); (test)
            scanner.nextLine(); // Consume the newline character after reading the choice


            if (choice.equals("1")) {
                // TODO Display the vending machine items
                for(VendingItem item : itemList){
                    System.out.println(item);
                }
                System.out.print("Choose item: ");
                String itemPicked = userInput.nextLine();
                for (VendingItem item: itemList){
                    if (item.getSlotID().equals(itemPicked)){
                        if ( item.getPrice() <= vendingMachine.getBalanceInserted())   {
                            double change = vendingMachine.getBalanceInserted();
                          change = vendingMachine.getBalanceInserted() - item.getPrice();
                           vendingMachine.setBalanceInserted(0.0);
                            System.out.println("You have purchased a: " + item.getName() + " for the price of: $" + item.getPrice());
                            System.out.println("Change received: $" + change);
                        }

                    }
                }
                //TODO purchase itmes menu
                //TODO pick choice
                //TODO give change if needed
                //TODO give items


            } else if (choice.equals("2") ) {
                vendingMachine.FeedMoney();
                System.out.println("current balance is: " + vendingMachine.getBalanceInserted());


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

