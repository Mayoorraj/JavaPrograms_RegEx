package com.bridgelabz.assignment19;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    //    First name pattern
    public static void checkFirstName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String firstName = sc.nextLine();
        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName)) {
            System.out.println("Valid entry.\n");
        } else {
            System.err.println("Invalid entry!" +
                    "\n-First letter should be capital,other letters should be small" +
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
            System.err.println("Invalid entry!" +
                    "\n-First letter should be capital" +
                    "\n-Last name should contain at least 3 letters\n");
            checkLastName();
        }
    }

    //    EmailID pattern
    public static void checkEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email : ");
        String email = sc.nextLine();
        if (Pattern.matches("^[a-zA-Z0-9]+([.][a-zA-Z0-9]+)*[@][a-z]+[.][a-z]{2,3}([.][a-z]{2})?$", email)) {
            System.out.println("Valid entry.\n");
        } else {
            System.err.println("Invalid entry!" +
                    "\n-user name should have at least 3 letters" +
                    "\n-It should contain . after company name, company domain" +
                    "\n-Company name should be 2 letters" +
                    "\n-Company domain should be 2 letters");
            checkEmail();
        }
    }

    //    Mobile phone no. pattern
    public static void checkMobileNo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phone No : ");
        String mobileNo = sc.nextLine();
        if (Pattern.matches("[0-9]{2}+[ ][0-9]{10}$", mobileNo)) {
            System.out.println("Valid entry.");
        } else {
            System.err.println("Invalid entry!" +
                    "\n-Mobile phone no. should contain 12 digits including country code" +
                    "\n-It should contain only digits");
            checkMobileNo();
        }
    }

    // Password pattern
    public static void checkPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String password = sc.nextLine();
        if (Pattern.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$).{8,}", password)) {
            System.out.println("Valid entry.");
        } else {
            System.err.println("Invalid entry!" +
                    "\n-Password length should be of minimum 8 characters" +
                    "\n-Password should contain at least one capital letter" +
                    "\n-Password should contain at least one numeric character" +
                    "\n-Password should contain at least one special character [ _!@#$%^&*() ]");
            checkPassword();
        }
    }
    public static void main(String[] args) {
        System.out.println("Register new user here-");
        checkFirstName();
        checkLastName();
        checkEmail();
        checkMobileNo();
        checkPassword();

        System.out.println("Testing given sample EmailIDs for used pattern..\n");
        ArrayList<String> email = new ArrayList<>();
//        valid EmailIDs
        email.add("abc@yahoo.com");
        email.add("abc-100@yahoo.com");
        email.add("abc.100@yahoo.com");
        email.add("abc111@abc.com");
        email.add("abc-100@abc.net");
        email.add("abc.100@abc.com.au");
        email.add("abc@1.com");
        email.add("abc@gmail.com.com");
        email.add("abc+100@gmail.com");
//        invalid EmailIDs
        email.add("abc");
        email.add("abc..");
        email.add("abc..@gmail.com");
        email.add("abc@abc@gmail.com");
        email.add("abc@.com.my");
        email.add("abc123@gmail.a");
        email.add("abc123@.com");
        email.add("abc123@.com.com");
        email.add(".abc@abc.com");
        email.add("abc()*@gmail.com");
        email.add("abc..2002@gmail.com");
        email.add("abc.@gmail.com");
        email.add("abc@abc@gmail.com");
        email.add("abc@gmail.com.1a");
        email.add("abc..@gmail.com");
        email.add("abc@gmail.com.aa.au");

        String reGex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:([0-9]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}";
        Pattern pattern = Pattern.compile(reGex);
        for (String str : email) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                System.out.println("valid email: " + str + " :" + matcher.matches());
            } else {
                System.out.println("Invalid email: " + str + " :" + matcher.matches());
            }
        }
    }
}