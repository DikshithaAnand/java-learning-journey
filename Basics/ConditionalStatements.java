// ConditionalStatements.java
public class ConditionalStatements {
    public static void main(String[] args) {

        int number = 10;

        // if statement
        if (number > 0) {
            System.out.println("Number is positive");
        }

        // if-else statement
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // else-if ladder
        int marks = 85;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }
}
