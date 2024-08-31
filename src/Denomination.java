
public class Denomination {

    public record Denominations(String name, double amount, String form, String img) { }

    public static void main(String[] args) {
        Denominations hundredNote = new Denominations("Hundred Note", 100.00, "bill", "hundred.png");
        Denominations fiftyNote = new Denominations("Fifty Note", 50.00, "bill", "fifty.png");
        Denominations twentyNote = new Denominations("Twenty Note", 20.00, "bill", "twenty.png");
        Denominations tenNote = new Denominations("Ten Note", 10.00, "bill", "ten.png");
        Denominations fiveNote = new Denominations("Five Note", 5.00, "bill", "five.png");
        Denominations oneNote = new Denominations("One Note", 1.00, "bill", "one.png");
        Denominations quarter = new Denominations("Quarter", 0.25, "coin", "quarter.png");
        Denominations dime = new Denominations("Dime", 0.10, "coin", "dime.png");
        Denominations nickel = new Denominations("Nickel", 0.05, "coin", "nickel.png");
        Denominations penny = new Denominations("Penny", 0.01, "coin", "penny.png");
    }
}
