import java.util.Scanner;

public class DevTestgetRangedDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = getRangedDouble(scanner, "Please enter a value", 1.2, 3.5);
        System.out.println("You entered: " + value);
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double value = 0.0;

        while (true) {
            System.out.println(prompt + " [" + low + " - " + high + "]:");
            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                pipe.nextLine(); // consume newline left-over

                if (value >= low && value <= high) {
                    break;
                } else {
                    System.out.println("The entered value is not within the specified range. Please try again.");
                }
            } else {
                System.out.println("That's not a valid double value. Please try again.");
                pipe.next(); // discard non-double input
            }
        }
        return value;
    }
}
