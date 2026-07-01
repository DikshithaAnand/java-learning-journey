// Built-in Annotations Example

class Animal {

    public void sound() {
        System.out.println("Animal makes a sound.");
    }

    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated.");
    }
}

class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

public class Annotations {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.sound();

        // Calling deprecated method
        dog.oldMethod();

        // Raw type warning suppressed
        @SuppressWarnings("rawtypes")
        java.util.ArrayList list = new java.util.ArrayList();

        list.add("Java");
        list.add(100);

        System.out.println(list);
    }
}
