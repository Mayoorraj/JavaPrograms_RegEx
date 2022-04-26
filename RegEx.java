package com.bridgelabz.assignment19;

import java.util.Scanner;

public class RegEx {
//    First name pattern
    public static boolean FirstName(String firstName){
        return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
    }
    public static void main(String[] args) {
        System.out.println("User Name: \nEnter the first name: ");
        Scanner sc = new Scanner(System.in);
        boolean result = FirstName(sc.next());
        if (result) {
            System.out.println("User name is valid, please proceed..");
        }
        else {
            System.out.println("Invalid first name!");
            System.err.println("-First letter should be capital\n-Name should contain at least 3 letters");
        }
    }
}
