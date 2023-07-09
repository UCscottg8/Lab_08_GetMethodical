public class PrettyHeader {

    public static void main(String[] args) {
        prettyHeader("Message Centered Here");
    }

    public static void prettyHeader(String msg) {
        final int LINE_WIDTH = 60;
        int msgLength = msg.length();
        int totalStars = 6; // 3 stars on each side of the message
        int totalSpacing = LINE_WIDTH - (msgLength + totalStars);
        int leftSpacing = totalSpacing / 2;
        int rightSpacing = totalSpacing - leftSpacing;

        printLine(LINE_WIDTH);
        printMessageLine(msg, leftSpacing, rightSpacing);
        printLine(LINE_WIDTH);
    }

    public static void printLine(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printMessageLine(String msg, int leftSpacing, int rightSpacing) {
        printSpaces(leftSpacing);
        System.out.print("*** " + msg + " ***");
        printSpaces(rightSpacing);
        System.out.println();
    }

    public static void printSpaces(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(" ");
        }
    }
}
