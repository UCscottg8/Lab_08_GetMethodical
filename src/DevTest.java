import java.util.Scanner;


    /**public class DevTestgetInt {
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
*/

    /**public class DevTestgetDouble {
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
     */

    /**public class DevTestgetRangedInt {
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
    */

  /**  public class DevTestgetRangedDouble {
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
*/