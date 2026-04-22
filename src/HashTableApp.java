import java.util.HashMap;

public class HashTableApp {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 20, 40, 10, 50};

        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.println("Duplicate Elements:");

        for (int num : numbers) {
            if (map.containsKey(num)) {
                System.out.println(num);
            } else {
                map.put(num, 1);
            }
        }
    }
}