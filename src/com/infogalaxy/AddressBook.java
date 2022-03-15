package com.infogalaxy;

import java.util.Scanner;

public class AddressBook {
    static Scanner sc = new Scanner(System.in);
    Contact contact = new Contact();

    //UC-1 Add Contact to Address Book...
    public void addContact() {
        System.out.println("Enter First Name :=");
        contact.setFirstname(sc.next());
        System.out.println("Enter Last Name :=");
        contact.setLastname(sc.next());
        System.out.println("Enter Address :=");
        contact.setAddress(sc.next());
        System.out.println("Enter City :=");
        contact.setCity(sc.next());
        System.out.println("Enter State :=");
        contact.setState(sc.next());
        System.out.println("Enter Zip :=");
        contact.setZip(sc.next());
        System.out.println("Enter Phone Number :=");
        contact.setPhoneno(sc.next());
        System.out.println("Enter Email ID :=");
        contact.setEmail(sc.next());
    }
    //UC-2 Display the Contact to Address Book
    public void displayContact() {
        System.out.println(contact.toString());
    }
    //UC-3 Edit the Contact to Address Book
    public void editContact() {
        System.out.println("Enter the First Name :");
        String name = sc.next();
        if (name.equalsIgnoreCase(contact.getFirstname())) {
            System.out.println("Enter Last Name :=");
            contact.setLastname(sc.next());
            System.out.println("Enter Address :=");
            contact.setAddress(sc.next());
            System.out.println("Enter City :=");
            contact.setCity(sc.next());
            System.out.println("Enter State :=");
            contact.setState(sc.next());
            System.out.println("Enter Zip :=");
            contact.setZip(sc.next());
            System.out.println("Enter Phone Number :=");
            contact.setPhoneno(sc.next());
            System.out.println("Enter Email ID :=");
            contact.setEmail(sc.next());
        } else {
            System.out.println("Contact not Found");
        }
    }
    //UC-4 Delete the Contact to Address Book
//    public void deleteContact() {
//        System.out.println("Enter the First Name to Delete the Contact");
//        String name = sc.next();
//        if (name.equalsIgnoreCase(contact.getFirstname())) {
//            System.out.println("Contact is Found");
//            contact = null;
//        } else {
//            System.out.println("Contact Not Found");
//        }
//    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        int choice;
        do {
            System.out.println("**** ADDRESS BOOK MANAGER ****");
            System.out.println("1.ADD NEW CONTACT \n2.EDIT CONTACT \n3.DISPLAY CONTACT \n4.DELETE CONTACT \n5.EXIT");
            System.out.println("Enter Your Choice :");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    addressBook.displayContact();
                    break;
                case 4:
                    //addressBook.deleteContact();
                    break;
            }
        }while(choice != 5);
    }
}
