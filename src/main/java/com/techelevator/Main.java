package com.techelevator;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
            Scanner scanner = null;
            int choice = Integer.parseInt(userInput.nextLine());
//            System.out.println(choice); (test)
            scanner.nextLine(); // Consume the newline character after reading the choice
            Map<String, String> vendingItems = new HashMap<>();

            if (choice == 1) {
                // Display the vending machine items
//                VendingMachine.displayItems();
            } else if (choice == 2) {
                // Initiate the purchase process by creating a PurchaseMenu object
//                vendingItems.addItems(); // Add items to Map "vendingItems"
            } else if (choice == 3) {
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

