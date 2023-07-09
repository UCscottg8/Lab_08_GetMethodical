import java.util.InputMismatchException;
import java.util.Scanner;

    public class DevTest {
        public static void main(String[] args) {
            int value = getInt();
            System.out.println("You entered: " + value);
        }

        public static int getInt() {
            Scanner scanner = new Scanner(System.in);
            int value = 0;

            while (true) {
                System.out.println("Please enter an integer:");
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
    }
