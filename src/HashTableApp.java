import java.util.HashMap;

public class HashTableApp {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Dheeraj");
        students.put(102, "Krishna");
        students.put(103, "Shritan");

        int searchKey = 102;

        if (students.containsKey(searchKey)) {
            System.out.println("Key Found");
            System.out.println("Value = " + students.get(searchKey));
        } else {
            System.out.println("Key Not Found");
        }
    }
}