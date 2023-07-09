import java.util.InputMismatchException;
import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intValue = getInt(scanner);
        System.out.println("Your favorite integer is: " + intValue);

        double doubleValue = getDouble(scanner);
        System.out.println("Your favorite double is: " + doubleValue);
    }

    public static int getInt(Scanner scanner) {
        int value = 0;

        while (true) {
            System.out.println("Please enter your favorite integer:");
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                scanner.nextLine(); // consume newline left-over
                break;
            } else {
                System.out.println("That's not a valid integer. Please try again.");
                scanner.next(); // discard non-int input
            }
        }
        return value;
    }

    public static double getDouble(Scanner scanner) {
        double value = 0.0;

        while (true) {
            System.out.println("Please enter your favorite double value:");
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                scanner.nextLine(); // consume newline left-over
                break;
            } else {
                System.out.println("That's not a valid double value. Please try again.");
                scanner.next(); // discard non-double input
            }
        }
        return value;
    }
}
