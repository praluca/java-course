package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone contactsList = new MobilePhone();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    contactsList.printContacts();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }
    public static  void printInstructions() {
        System.out.println("\n Press");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of contacts items");
        System.out.println("\t 2 - To add an item to the contacts list");
        System.out.println("\t 3 - To modify an item in the contacts list");
        System.out.println("\t 4 - To remove an item from the contacts list");
        System.out.println("\t 5 - To search for the item in the contacts list");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addItem() {
        System.out.println("Please enter the contact: ");
        contactsList.addContact(new Contacts(scanner.nextLine(), scanner.nextLine()));
    }

    public static void modifyItem() {
        System.out.println("Enter contact position: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        Contacts newItem = new Contacts(scanner.nextLine(), scanner.nextLine());
        contactsList.updateContact(itemNo, newItem);
    }

    public static  void removeItem() {
        System.out.println("Enter  item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        contactsList.removeContact(itemNo);

    }

    public static void searchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(contactsList.findContact(searchItem) >= 0) {
            System.out.println("Found " + searchItem + " in our contacts List");
        } else {
            System.out.println(searchItem + " is not in the contacts list");
        }
    }
}
