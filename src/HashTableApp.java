import java.util.HashMap;

public class HashTableApp {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Dheeraj");
        students.put(102, "Krishna");
        students.put(103, "Shritan");

        System.out.println("Student Records:");
        System.out.println(students);
    }
}