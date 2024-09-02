// Register file
// This file contains a function to calculate the amount of change as well as command line ui
import java.util.Scanner;

public class Register {

    // method responsible for calculation
        public static Purse makeChange(double amount) {
            // create purse
            Purse purse = new Purse();

            // convert dollars to cents
            int cents = (int) (amount * 100);

            // num of hundreds
            int hundreds = cents / 10000;
            if (hundreds > 0){
                purse.add(DenominationList.hundredNote, hundreds);
                cents %= 10000;
            }

            // num of fifties
            int fifties = cents / 5000;
            if (fifties > 0){
                purse.add(DenominationList.fiftyNote, fifties);
                cents %= 5000;
            }

            // num of twenties
            int twenties = cents / 2000;
            if (twenties > 0){
                purse.add(DenominationList.twentyNote, twenties);
                cents %= 2000;
            }

            // num of tens
            int tens = cents / 1000;
            if (tens > 0){
                purse.add(DenominationList.tenNote, tens);
                cents %= 1000;
            }

            // num of fives
            int fives = cents / 500;
            if (fives > 0){
                purse.add(DenominationList.fiveNote, fives);
                cents %= 500;
            }

            // num of ones
            int ones = cents / 100;
            if (ones > 0){
                purse.add(DenominationList.oneNote, ones);
                cents %= 100;
            }

            // num of quarters
            int quarters = cents / 25;
            if (quarters > 0){
                purse.add(DenominationList.quarter, quarters);
                cents %= 25;
            }

            // num of dimes
            int dimes = cents / 10;
            if (dimes > 0){
                purse.add(DenominationList.dime, dimes);
                cents %= 10;
            }

            // num of nickels
            int nickels = cents / 5;
            if (nickels > 0){
                purse.add(DenominationList.nickel, nickels);
                cents %= 5;
            }

            // num of pennies
            int pennies = cents;
            if (pennies > 0){
                purse.add(DenominationList.penny, pennies);
            }


            return purse;
        }
        // main method
        public static void main(String[] args) {
            // creates scanner and ask for user input
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an amount in dollars (Ex: 4.56): ");
            double amount = sc.nextDouble();

            // method call
            Purse purse = makeChange(amount);
            System.out.println("Change Given: ");
            System.out.println(purse.toString());

        }
}

