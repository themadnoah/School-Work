package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount , balance = 0.0;
        String  adOrUser, adminPassword;
        int accountID = 0;
        boolean makeAccounts = true;

        BankAccounts accountOne = new BankAccounts(123450, balance);
        BankAccounts accountTwo = new BankAccounts(123451, balance);
        BankAccounts accountThree = new BankAccounts(123452, balance);

        System.out.println("Standard user or Admin?");
        adOrUser = input.nextLine();

        if (adOrUser.equalsIgnoreCase("admin")){
            System.out.println("Please enter your password.\n Must be at least 8 characters long and must contain 2 digits and has to be alphanumeric only.");
            adminPassword = input.nextLine();

            if (PasswordChecker.Rules(adminPassword)){
                while (makeAccounts) {
                    System.out.println("Would you like to create a new account?(yes or no)");
                    adOrUser = input.nextLine();

                    if (adOrUser.equalsIgnoreCase("Yes")) {
                        System.out.println("what would you like for your account number?");
                        accountID = input.nextInt();
                        System.out.println("How much money is the user going to put in the account?");
                        balance = input.nextDouble();

                    } else {
                        System.out.println("Than why are you wasting my time?");
                        makeAccounts = false;
                    }
                }
            }else{
                System.out.println("Okay it didn't work.");
            }

        }
    }


}
