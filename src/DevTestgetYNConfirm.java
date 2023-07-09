import java.util.Scanner;

public class DevTestgetYNConfirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean confirm = getYNConfirm(scanner, "Do you wish to proceed?");
        System.out.println("Confirmation status: " + confirm);
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        while (true) {
            System.out.println(prompt + " [Y/N]");
            String response = pipe.nextLine().trim().toLowerCase();

            if (response.equals("y")) {
                return true;
            } else if (response.equals("n")) {
                return false;
            } else {
                System.out.println("Invalid input. Please enter 'Y' for yes or 'N' for no.");
            }
        }
    }
}