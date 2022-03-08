package com.infogalaxy;

import java.util.Scanner;

public class AddressBook {
    //UC-1 Add Contact to Address Book...
    Scanner sc = new Scanner(System.in);
    Contact contact = new Contact();
    public void getContact() {
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
    public void displayContact() {
        System.out.println(contact.toString());
    }
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.getContact();
        addressBook.displayContact();
    }
}
