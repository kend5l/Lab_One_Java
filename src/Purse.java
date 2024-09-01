// This is our purse file. This is where we store our purse class and methods
// to add and compute the money stored inside it

import java.util.HashMap;
import java.util.Map;

public class Purse {
    // cash map
    public Map<DenominationList.Denominations, Integer> cash;
    // Constructor
    public Purse() {
        cash = new HashMap<>();
    }
    // add method
    public void add(DenominationList.Denominations type, int num) {
        // adds units of specified type to the map. defaults to 0
        cash.put(type, cash.getOrDefault(type, 0) + num);
    }
    // remove method
    public double remove(DenominationList.Denominations type, int num) {
        // subtracts units of specified type
        cash.put(type, cash.get(type) - num);
        return type.amount() * num;
    }
    // get value method
    public double getValue() {
        double total = 0;
        // calculates total value of all units in cash map
        for (Map.Entry<DenominationList.Denominations, Integer> entry : cash.entrySet()) {
            total += entry.getKey().amount() * entry.getValue();
        }
        return total;
    }
    // to string method to construct a string representation of the purse value
    public String toString() {
        StringBuilder sb = new StringBuilder();
        // appends denomination name and quantity to string builder, pretty cool
        for (Map.Entry<DenominationList.Denominations, Integer> entry : cash.entrySet()) {
            sb.append(entry.getKey().name()).append(": ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }

}
