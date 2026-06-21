import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Fruits: " + fruits);

        // Access an element
        System.out.println("First Fruit: " + fruits.get(0));

        // Update an element
        fruits.set(1, "Orange");
        System.out.println("After Update: " + fruits);

        // Remove an element
        fruits.remove("Apple");
        System.out.println("After Removal: " + fruits);

        // Size of ArrayList
        System.out.println("Size: " + fruits.size());

        // Check if element exists
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // Iterate using for-each loop
        System.out.println("\nIterating through ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
