import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveNumber = 0;
        for (int i = 0; i < 6; ++i) {
            double number = scanner.nextDouble();
            if (number > 0) {
                ++positiveNumber;
            }
        }

        System.out.println(positiveNumber + " valores positivos");
    }
}
