package com.collection.javacollection.TreeMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> book = new TreeMap<>();
        int choice;
        String name;
        String phoneNo;
        String searchName;
        String foundName;
        String foundNumber;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Add a new contact");
            System.out.println("2 - Search for a contact");
            System.out.println("3 - Update a contact");
            System.out.println("4 - Delete a contact");
            System.out.println("5 - Display all contacts");
            System.out.println("6 - Exit");
            System.out.print("Enter your choice: ");

            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter name: ");
                    name = scan.nextLine();
                    System.out.println("Enter phone number: ");
                    phoneNo = scan.nextLine();
                    // add name and phone number to TreeMap
                    book.put(name, phoneNo);
                    System.out.println("Contact added successfully");
                    break;
                case 2:
                    System.out.println("Enter name to search for: ");
                    searchName = scan.nextLine();
                    for (Map.Entry<String, String> entry : book.entrySet()) {
                        if (entry.getKey().equals(searchName)) {
                            foundName = entry.getKey(); // found the name
                            foundNumber = entry.getValue(); // found the number
                            System.out.println("Name found: " + foundName);
                            System.out.println("Phone number found: " + foundNumber);
                            break; // Exit the loop once the value is found
                        } else {
                            System.out.println("Contact not found");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter name to update: ");
                    name = scan.nextLine();
                    System.out.println("Enter new phone number: ");
                    phoneNo = scan.nextLine();
                    // update name and phone number to TreeMap
                    book.put(name, phoneNo);
                    break;
                case 4:
                    System.out.println("Enter name to delete: ");
                    name = scan.nextLine();
                    if (book.containsKey(name)) {
                        book.remove(name);
                        System.out.println("Contact deleted successfully");
                    } else {
                        System.out.println("Contact not found");
                    }
                    break;
                case 5:
                    System.out.println("Enter name to update: ");
                    name = scan.nextLine();
                    System.out.println("Enter phone number to update: ");
                    phoneNo = scan.nextLine();
                    for (Map.Entry<String, String> entry : book.entrySet()) {
                        System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
                    }
                    System.out.println("Contact updated successfully");
                case 6:
                    System.out.println("Exiting the phonebook application");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        } while (choice != 6);
        scan.close();
    }
}
