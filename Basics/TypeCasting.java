// TypeCasting.java
public class TypeCasting {
    public static void main(String[] args) {

        // Widening Casting (automatic)
        int num = 10;
        double doubleNum = num;

        System.out.println("Integer value: " + num);
        System.out.println("Converted to double: " + doubleNum);

        // Narrowing Casting (manual)
        double price = 99.99;
        int intPrice = (int) price;

        System.out.println("Double value: " + price);
        System.out.println("Converted to int: " + intPrice);
    }
}
