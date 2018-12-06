import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        float value1, value2, value3, average;

        for (float i = 0; i < n; i++) {
            value1 = scanner.nextFloat();
            value2 = scanner.nextFloat();
            value3 = scanner.nextFloat();
            average = ((value1 * 2 + value2 * 3 + value3 * 5) / 10);

            System.out.printf("%.1f%n", average);
        }
    }
}
