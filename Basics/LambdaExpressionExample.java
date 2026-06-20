interface Greeting {
    void sayHello(String name);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {

        // Lambda expression implementation
        Greeting greet = (name) -> {
            System.out.println("Hello, " + name + "!");
        };

        greet.sayHello("Dikshitha");

        // Lambda with no parameters
        Runnable task = () -> {
            System.out.println("Running task...");
        };

        task.run();

        // Lambda with return value
        Calculator add = (a, b) -> a + b;

        System.out.println("Sum: " + add.calculate(10, 20));
    }
}

interface Calculator {
    int calculate(int a, int b);
}
