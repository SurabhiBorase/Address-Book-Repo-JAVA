package com.infogalaxy;

import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
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
        }
        else {
            System.out.println("Contact not Found");
        }
    }
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        addressBook.displayContact();
        addressBook.editContact();
        addressBook.displayContact();
    }
}
