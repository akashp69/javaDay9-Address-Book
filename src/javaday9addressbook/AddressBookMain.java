package javaday9addressbook;

import java.util.*;

class AddressBook {
    String firstName, lastName, address, city, state,email;
    long phoneNo;
    int zip;
    public void setDetails(){
        firstName = "Akash";
        lastName = "Pakhare";
        address = "Urjanagar";
        city ="Chandrapur";
        state = "Maharastra";
        zip = 442401;
        phoneNo = 942343855;
        email = "akashpakhare499@gmail.com";
    }
    public void printDetails(){

        System.out.println("\nFirst Nmae : " + firstName  + "\n\nLast Name : " + lastName + "\n\nAddress : " + address + "\n\nCity : " + city + "\n\nState : " + state + "\n\nZip : " + zip + "\n\nPhone Number : " + phoneNo + "\n\nE-mail : " + email);
    }
}
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook System");
        AddressBook address = new AddressBook();
        address.setDetails();
        address.printDetails();
    }
}