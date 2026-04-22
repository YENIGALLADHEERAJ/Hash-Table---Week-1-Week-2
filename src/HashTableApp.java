import java.util.HashMap;

public class HashTableApp {
    public static void main(String[] args) {

        HashMap<String, Boolean> users = new HashMap<>();

        users.put("dheeraj", true);
        users.put("krishna", true);
        users.put("shritan", true);

        String newUsername = "krishna";

        if (users.containsKey(newUsername)) {
            System.out.println("Username already taken");
        } else {
            System.out.println("Username available");
        }
    }
}