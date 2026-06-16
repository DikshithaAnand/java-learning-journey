import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("Original List: " + fruits);

        // Access an element
        System.out.println("First Fruit: " + fruits.get(0));

        // Remove an element
        fruits.remove("Banana");
        System.out.println("After Removing Banana: " + fruits);

        // Sort the list
        Collections.sort(fruits);
        System.out.println("Sorted List: " + fruits);

        // Iterate through the list
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Check size
        System.out.println("Total Fruits: " + fruits.size());
    }
}
