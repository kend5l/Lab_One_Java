import java.util.Scanner;

public class Register {

        // method responsible for calculation
        public static Purse makeChange(double amount) {
            Purse purse = new Purse();
            // convert dollars to cents
            int cents = (int) (amount * 100);
            // num of hundreds
            int hundreds = cents / 10000;
            cents %= 10000;
            // num of fifties
            int fifties = cents / 5000;
            cents %= 5000;
            // num of twenties
            int twenties = cents / 2000;
            cents %= 2000;
            // num of tens
            int tens = cents / 1000;
            cents %= 1000;
            // num of fives
            int fives = cents / 500;
            cents %= 500;
            // num of ones
            int ones = cents / 100;
            cents %= 100;
            // num of quarters
            int quarters = cents / 25;
            cents %= 25;
            // num of dimes
            int dimes = cents / 10;
            cents %= 10;
            // num of nickels
            int nickels = cents / 5;
            cents %= 5;
            // num of pennies
            int pennies = cents;

            return purse;
        }
        // main method
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an amount in dollars (Ex: 4.56): ");
            double amount = sc.nextDouble();
            // method call
            Purse purse = makeChange(amount);
        }
}

