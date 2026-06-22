import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> cities = new LinkedList<>();

        // Add elements
        cities.add("Bengaluru");
        cities.add("Mumbai");
        cities.add("Delhi");

        System.out.println("Cities: " + cities);

        // Add elements at specific positions
        cities.addFirst("Chennai");
        cities.addLast("Hyderabad");

        System.out.println("After adding first and last: " + cities);

        // Access elements
        System.out.println("First City: " + cities.getFirst());
        System.out.println("Last City: " + cities.getLast());

        // Remove elements
        cities.removeFirst();
        cities.removeLast();

        System.out.println("After removing first and last: " + cities);

        // Check if an element exists
        System.out.println("Contains Mumbai? " + cities.contains("Mumbai"));

        // Size of LinkedList
        System.out.println("Size: " + cities.size());

        // Iterate through the LinkedList
        System.out.println("\nIterating through LinkedList:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
