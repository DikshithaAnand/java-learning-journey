public class StringExample {
    public static void main(String[] args) {

        String firstName = "Dikshitha";
        String lastName = "Anand";

        // Concatenation
        String fullName = firstName + " " + lastName;

        // String methods
        System.out.println("Full Name: " + fullName);
        System.out.println("Length: " + fullName.length());
        System.out.println("Uppercase: " + fullName.toUpperCase());
        System.out.println("Lowercase: " + fullName.toLowerCase());

        // Checking content
        System.out.println("Contains Anand? " + fullName.contains("Anand"));

        // Character access
        System.out.println("First Character: " + fullName.charAt(0));
    }
}
