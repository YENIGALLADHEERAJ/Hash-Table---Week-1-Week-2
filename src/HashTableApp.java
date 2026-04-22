import java.util.HashMap;

public class HashTableApp {
    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];

            if (map.containsKey(complement)) {
                System.out.println("Pair Found:");
                System.out.println(complement + " + " + numbers[i] + " = " + target);
                return;
            }

            map.put(numbers[i], i);
        }

        System.out.println("No Pair Found");
    }
}