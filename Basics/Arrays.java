public class Arrays {

    public static void main(String[] args) {

        // Declaring an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        // Modifying array element
        numbers[2] = 100;

        System.out.println("Updated third element: " + numbers[2]);

        // Array length
        System.out.println("Array length: " + numbers.length);

        // Loop through array using for loop
        System.out.println("\nUsing for loop:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Enhanced for loop
        System.out.println("\nUsing enhanced for loop:");

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
