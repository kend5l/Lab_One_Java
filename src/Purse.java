
import java.util.HashMap;
import java.util.Map;

public class Purse {
    private final Map<DenominationList.Denominations, Integer> cash;

    public Purse() {
        cash = new HashMap<>();
    }

    public void add(DenominationList.Denominations type, int num) {
        cash.put(type, cash.getOrDefault(type, 0) + num);
    }

    public double remove(DenominationList.Denominations type, int num) {
        cash.put(type, cash.get(type) - num);
        return type.amount() * num;
    }

    public double getValue() {
        double total = 0;
        for (Map.Entry<DenominationList.Denominations, Integer> entry : cash.entrySet()) {
            total += entry.getKey().amount() * entry.getValue();
        }
        return total;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<DenominationList.Denominations, Integer> entry : cash.entrySet()) {
            sb.append(entry.getKey().name()).append(": ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }

}
