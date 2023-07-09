public class cToFTableDisplaydoubleCelsius {

    public static double CtoF(double Celsius) {
        double fahrenheit = (Celsius * 9.0 / 5.0) + 32.0;
        return fahrenheit;
    }

    public static void main(String[] args) {
        System.out.println("Celsius\tFahrenheit");
        for(int i = -100; i <= 100; i++) {
            System.out.println(i + "\t" + CtoF(i));
        }
    }
}
