import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int i = 0;

        int number;
        do {
            number = scanner.nextInt();
            sum += number;
            i++;
        } while (number != 0);

        --i;

        if (i == 0) {
            System.err.println("Nothing to calculate");
            System.exit(-1);
        }

        double mean = (double) sum / i;
        System.out.printf("The arithmetic mean is %.1f%n", mean);
    }
}
