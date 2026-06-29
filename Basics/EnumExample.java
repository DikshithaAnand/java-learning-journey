enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class EnumExample {
    public static void main(String[] args) {

        Day today = Day.MONDAY;

        System.out.println("Today is: " + today);

        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week.");
                break;

            case FRIDAY:
                System.out.println("Weekend is near!");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("Enjoy the weekend!");
                break;

            default:
                System.out.println("Regular working day.");
        }

        System.out.println("\nAll Days:");

        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
