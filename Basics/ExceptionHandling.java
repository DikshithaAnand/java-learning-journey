public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Arithmetic Exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("Program execution completed.");
        }

        System.out.println("End of program.");
    }
}
