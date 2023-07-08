public class SafeInput {
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do
        {
            System.out.print(“\n” +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }

}

import java.util.InputMismatchException;
        import java.util.Scanner;

public class Main {
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

import java.util.Scanner;

public class Main {
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

import java.util.Scanner;

public class Main {
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

