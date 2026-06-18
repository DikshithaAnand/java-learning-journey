import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        // Add key-value pairs
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        System.out.println("Students: " + students);

        // Access value using key
        System.out.println("Student with ID 102: " + students.get(102));

        // Check if a key exists
        System.out.println("Contains ID 101? " + students.containsKey(101));

        // Remove an entry
        students.remove(103);

        System.out.println("After Removal: " + students);

        // Iterate through HashMap
        System.out.println("\nStudent Records:");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(
                "ID: " + entry.getKey() +
                ", Name: " + entry.getValue()
            );
        }
    }
}
