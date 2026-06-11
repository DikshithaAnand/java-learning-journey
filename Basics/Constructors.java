public class Constructors {

    String name;
    int age;

    Constructors(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Constructors student = new Constructors("Dikshitha", 20);
        student.display();
    }
}
