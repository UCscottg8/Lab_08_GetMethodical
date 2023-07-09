import java.util.Scanner;

public class DevTestgetDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = getDouble(scanner, "Please enter a double value:");
        System.out.println("You entered: " + value);
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double value = 0.0;

        while (true) {
            System.out.println(prompt);
            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                pipe.nextLine(); // consume newline left-over
                break;
            } else {
                System.out.println("That's not a valid double value. Please try again.");
                pipe.next(); // discard non-double input
            }
        }
        return value;
    }
}