import java.util.Scanner;
import java.util.regex.Pattern;

public class DevTestgetRegExString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = getRegExString(scanner, "Please enter a valid email:", "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b");
        System.out.println("You entered: " + result);
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input = "";

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