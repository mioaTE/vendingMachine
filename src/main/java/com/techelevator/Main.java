package com.techelevator;


import jdk.swing.interop.SwingInterOpUtils;

import java.math.BigDecimal;
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
            System.out.println("(2) Purchase");
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

                //TODO purchase itmes menu
                //TODO pick choice
                //TODO give change if needed
                //TODO give items


            } else if (choice.equals("2") ) {
                boolean menu2Exit = false;
                while(!menu2Exit) {
                    //TODO add another menu 1, 2, 3
                    System.out.println("(1) Feed Money");
                    System.out.println("(2) Select Product");
                    System.out.println("(3) Finish Transaction");

                    System.out.print("\nPlease enter your choice: ");
                    choice = userInput.nextLine();

                    if (choice.equals("1")) {
                        vendingMachine.FeedMoney();
                        System.out.println("current balance is: " + vendingMachine.getBalanceInserted());

                    } else if (choice.equals("2")) {
                        System.out.print("Choose item: ");
                        String itemPicked = userInput.nextLine();
                        for (VendingItem item : itemList) {
                            if (item.getSlotID().equals(itemPicked)) {
                                if (item.getPrice() <= vendingMachine.getBalanceInserted()) {
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
                            // TODO Fix change

                        } while (balance > 0);
                        System.out.println("Dont forget your change! " + "Quarters: " + quarters + " Dimes: " + dimes + " Nickels: " + nickles);

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

