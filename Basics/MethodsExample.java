public class MethodsExample {

    // Method without return value
    static void greet() {
        System.out.println("Welcome to Java Programming!");
    }

    // Method with parameters
    static void displayName(String name) {
        System.out.println("Student Name: " + name);
    }

    // Method with return value
    static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        greet();

        displayName("Dikshitha");

        int sum = addNumbers(10, 20);

        System.out.println("Sum: " + sum);
    }
}
