package com.bridgelabz.assignment19;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegEx {
    //    First name pattern
    public static void checkFirstName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String firstName = sc.nextLine();
        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName)) {
            System.out.println( "Valid entry.\n");
        } else {
            System.err.println("Invalid entry!\n-First letter should be capital,other letters should be small" +
                    "\n-First name should contain at least 3 letters\n");
            checkFirstName();
        }
    }

    //    Last name pattern
    public static void checkLastName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Last name: ");
        String lastName = sc.nextLine();
        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastName)) {
            System.out.println("valid entry.\n");
        } else {
            System.err.println("Invalid entry!\n-First letter should be capital" +
                    "\n-Last name should contain at least 3 letters\n");
            checkLastName();
        }
    }

    //    EmailID pattern
    public static void checkEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email : ");
        String email = sc.nextLine();
        if(Pattern.matches("^[a-zA-Z0-9]+([.][a-zA-Z0-9]+)*[@][a-z]+[.][a-z]{2,3}([.][a-z]{2})?$",email)){
            System.out.println("Valid entry.");
        }
        else {
            System.err.println("Invalid entry!\n-user name should have at least 3 letters" +
                    "\n-It should contain . after company name, company domain" +
                    "\n-Company name should be 2 letters" +
                    "\n-Company domain should be 2 letters" );
            checkEmail();
        }
    }

    public static void main(String[] args) {

        checkFirstName();
        checkLastName();
        checkEmail();
    }
}