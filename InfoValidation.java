package com.bridgelabz.assignment20;

public class InfoValidation {
    public boolean validName(String name) {

        String nameRegex = "^[A-Z]{1}[a-z]{2,}$";
        return name.matches(nameRegex);
    }

    public boolean validEmail(String email) {

        String emailRegex = "^[a-zA-Z0-9]+([.][a-zA-Z0-9]+)*[@][a-z]+[.][a-z]{2,3}([.][a-z]{2})?$";
        return email.matches(emailRegex);
    }

    public boolean validMobNo(String mobileNumber) {

        String mobileNumberRegex = "^[0-9]{1,2}\\s{1}[0-9]{10}$";
        return mobileNumber.matches(mobileNumberRegex);
    }

    public boolean validPwd(String password) {

        String passwordRegex = "(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$).{8,}";
        return password.matches(passwordRegex);
    }
}