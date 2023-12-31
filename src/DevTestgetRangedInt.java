import java.util.Scanner;

public class DevTestgetRangedInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = getRangedInt(scanner, "Please enter a value", 10, 50);
        System.out.println("You entered: " + value);
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int value = 0;

        while (true) {
            System.out.println(prompt + " [" + low + " - " + high + "]:");
            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine(); // consume newline left-over

                if (value >= low && value <= high) {
                    break;
                } else {
                    System.out.println("The entered value is not within the specified range. Please try again.");
                }
            } else {
                System.out.println("That's not a valid integer. Please try again.");
                pipe.next(); // discard non-int input
            }
        }
        return value;
    }
}