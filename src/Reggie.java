import java.util.Scanner;
import java.util.regex.Pattern;

public class Reggie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ssn = getRegExString(scanner, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("You entered SSN: " + ssn);

        String mNumber = getRegExString(scanner, "Enter your UC Student M number", "^(M|m)\\d{5}$");
        System.out.println("You entered M number: " + mNumber);

        String menuChoice = getRegExString(scanner, "Enter your menu choice (O-Open, S-Save, V-View, Q-Quit)", "^[OoSsVvQq]$");
        System.out.println("You entered menu choice: " + menuChoice);
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input;
        while (true) {
            System.out.println(prompt);
            if (pipe.hasNextLine()) {
                input = pipe.nextLine();
                if (Pattern.matches(regEx, input)) {
                    break;
                } else {
                    System.out.println("The entered string does not match the expected pattern. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please try again.");
                pipe.nextLine(); // discard invalid input
            }
        }
        return input;
    }
}

