package com.cat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    public static boolean checkUserEmail(String email) {
        if (email == null) {
            System.out.println("You have not entered email");
            return false;
        }
        Pattern emailPattern = Pattern.compile("^\\w*@\\w*\\.\\w*$");
        Matcher emailMatcher = emailPattern.matcher(email);
        return emailMatcher.matches();
    }

    public static boolean checkUserPassword(String password) {
        if (password == null) {
            System.out.println("You have not entered password");
            return false;
        } else if (password.length() > 20) {
            System.out.println("You password is big");
            return false;
        } else if (password.length() < 8) {
            System.out.println("Your password is small");
            return false;
        } else {
            Pattern passwordPattern = Pattern.compile("^[a-zA-Z0-9?!_.&@#%^:/]*$");
            Matcher passwordMatcher = passwordPattern.matcher(password);
            return passwordMatcher.matches();
        }
    }
}
