enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class Enums {

    public static void main(String[] args) {

        Day today = Day.MONDAY;

        System.out.println("Today is: " + today);

        // Using enum in switch
        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week.");
                break;

            case FRIDAY:
                System.out.println("Weekend is near!");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend.");
                break;

            default:
                System.out.println("It's a regular weekday.");
        }

        // Print all enum values
        System.out.println("\nAll Days:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }

        // Ordinal (position)
        System.out.println("\nOrdinal of " + today + ": " + today.ordinal());

        // Convert String to Enum
        Day d = Day.valueOf("FRIDAY");
        System.out.println("Converted String to Enum: " + d);
    }
}
