```java
public class Operators {
    public static void main(String[] args) {

        // Arithmetic Operators
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Assignment Operator
        int x = 20;
        x += 5;
        System.out.println("Updated x value: " + x);

        // Comparison Operators
        System.out.println("a is greater than b: " + (a > b));
        System.out.println("a is equal to b: " + (a == b));

        // Logical Operators
        boolean condition1 = true;
        boolean condition2 = false;

        System.out.println("condition1 AND condition2: " + (condition1 && condition2));
        System.out.println("condition1 OR condition2: " + (condition1 || condition2));
    }
}
```
