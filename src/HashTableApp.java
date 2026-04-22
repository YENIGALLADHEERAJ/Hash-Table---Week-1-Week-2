import java.util.HashMap;

public class HashTableApp {
    public static void main(String[] args) {

        HashMap<String, Integer> stock = new HashMap<>();

        stock.put("Laptop", 5);
        stock.put("Mouse", 10);
        stock.put("Keyboard", 7);

        System.out.println("Current Stock:");
        System.out.println(stock);

        String product = "Mouse";

        if (stock.containsKey(product) && stock.get(product) > 0) {
            stock.put(product, stock.get(product) - 1);
            System.out.println(product + " purchased successfully");
        } else {
            System.out.println(product + " out of stock");
        }

        System.out.println("Updated Stock:");
        System.out.println(stock);
    }
}