package com.bridgelabz.assignment19;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegEx {
    //    First name pattern
    public void checkFirstName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String firstName = sc.nextLine();
        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName)) {
            System.out.println( "Valid entry..");
        } else {
            System.err.println("Invalid entry!\n-First letter should be capital\n-First name should contain at least 3 letters\n");
        }
    }

    //    Last name pattern
    public void checkLastName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Last name: ");
        String lastName = sc.nextLine();
        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastName)) {
            System.out.println("valid entry..");
        } else {
            System.out.println("Invalid entry!");
            System.err.println("-First letter should be capital\n-Last name should contain at least 3 letters");
        }
    }

    public static void main(String[] args) {

        RegEx userReg = new RegEx();
        userReg.checkFirstName();
        userReg.checkLastName();
    }
}