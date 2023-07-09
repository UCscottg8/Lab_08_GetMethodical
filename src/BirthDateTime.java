import java.util.Scanner;
import java.time.YearMonth;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = getRangedInt(scanner, "Enter the year of your birth", 1950, 2015);
        int month = getRangedInt(scanner, "Enter the month of your birth", 1, 12);

        // Get number of days in a month using java.time.YearMonth
        YearMonth yearMonthObject = YearMonth.of(year, month);
        int daysInMonth = yearMonthObject.lengthOfMonth();

        int day = getRangedInt(scanner, "Enter the day of your birth", 1, daysInMonth);

        int hours = getRangedInt(scanner, "Enter the hour of your birth", 1, 24);
        int minutes = getRangedInt(scanner, "Enter the minute of your birth", 0, 59);

        System.out.printf("You were born on %d-%d-%d at %d:%d", year, month, day, hours, minutes);
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int value;
        do {
            System.out.printf("\n%s [%d-%d]: ", prompt, low, high);
            while (!pipe.hasNextInt()) {
                System.out.println("That's not a number! Try again.");
                pipe.next();
            }
            value = pipe.nextInt();
            pipe.nextLine(); // Clear the newline character
        } while (value < low || value > high);
        return value;
    }
}


