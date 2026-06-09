class Student {
    String name;
    int age;

    // Method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ObjectOrientedProgramming {
    public static void main(String[] args) {

        // Creating object
        Student student1 = new Student();

        // Assigning values
        student1.name = "Dikshitha";
        student1.age = 20;

        // Calling method
        student1.displayInfo();
    }
}
