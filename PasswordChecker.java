package com.company;

/**
 * Created by hargrnoa000 on 3/16/2016.
 */
public class PasswordChecker {
    String userString;

    public PasswordChecker(String userString){
        this.userString = userString;
    }
    public static boolean Rules(String userString) {
        boolean working = true;
        for (int i = 0; i < userString.length(); i++) {
            if (userString.length() >= 8) {
            } else {
                System.out.println("Your password is not 8 characters long.");
                working = false;
            }
        }
        int digitCount = 0;
        for(int i = 0; i < userString.length(); i++){
            if (Character.isDigit(userString.charAt(i))){
                digitCount++;
            }
        }
        if (digitCount >= 2){
        } else{
            System.out.println("Your password does not have at least 2 digits");
            working = false;
        }
        for (int i = 0; i < userString.length(); i++) {
            if (Character.isLetterOrDigit(userString.charAt(i))) {

            } else {
                System.out.println("Your password has non alphanumeric characters inside of it");
                working = false;
            }
        }
        return working;
    }

}
