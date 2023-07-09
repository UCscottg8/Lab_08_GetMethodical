import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        boolean hasMore;

        do {
            double price = getRangedDouble(scanner, "Enter the price of your item", 0.50, 10.00);
            total += price;
            hasMore = getYNConfirm(scanner, "Do you have more items?");
        } while (hasMore);

        System.out.printf("The total cost of the items is: $%.2f\n", total);
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double value;
        do {
            System.out.printf("\n%s [%.2f-%.2f]: ", prompt, low, high);
            while (!pipe.hasNextDouble()) {
                System.out.println("That's not a valid number! Try again.");
                pipe.next();
            }
            value = pipe.nextDouble();
            pipe.nextLine(); // Clear the newline character
        } while (value < low || value > high);
        return value;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response;
        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine().trim().toUpperCase();
        } while (!response.equals("Y") && !response.equals("N"));
        return response.equals("Y");
    }
}

