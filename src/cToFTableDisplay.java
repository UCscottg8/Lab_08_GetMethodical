import java.util.Scanner;

public class cToFTableDisplay {

    public static double cToFTableDisplay(double celsius) {
        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        return fahrenheit;
    }

    public static double getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        scanner.close();
        return celsius;
    }

    public static void main(String[] args) {
        double celsius = getUserInput();
        double fahrenheit = cToFTableDisplay(celsius);
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
    }
}


