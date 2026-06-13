class Student {
    // Private variables (data hiding)
    private String name;
    private int age;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Dikshitha");
        student.setAge(21);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
