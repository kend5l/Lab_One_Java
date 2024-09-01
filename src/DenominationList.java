// This file stores a record of all the moneys we will use
// records include name, amount, type, and image name for GUI
public class DenominationList {

        public record Denominations(String name, double amount, String form, String img) {}

        public static final Denominations hundredNote = new Denominations("Hundred Note", 100.00, "bill", "Images/hundred.png");
        public static final Denominations fiftyNote = new Denominations("Fifty Note", 50.00, "bill", "Images/fifty.jpg");
        public static final Denominations twentyNote = new Denominations("Twenty Note", 20.00, "bill", "Images/twenty.jpg");
        public static final Denominations tenNote = new Denominations("Ten Note", 10.00, "bill", "Images/ten.jpg");
        public static final Denominations fiveNote = new Denominations("Five Note", 5.00, "bill", "Images/five.jpg");
        public static final Denominations oneNote = new Denominations("One Note", 1.00, "bill", "Images/one.jpg");
        public static final Denominations quarter = new Denominations("Quarter", 0.25, "coin", "Images/quarter.png");
        public static final Denominations dime = new Denominations("Dime", 0.10, "coin", "Images/dime.png");
        public static final Denominations nickel = new Denominations("Nickel", 0.05, "coin", "Images/nickel.png");
        public static final Denominations penny = new Denominations("Penny", 0.01, "coin", "Images/penny.png");
    }

