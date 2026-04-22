import java.util.HashMap;

public class HashTableApp {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 2, 4, 1, 2, 5};

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int num : numbers) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency Count:");
        System.out.println(frequency);
    }
}