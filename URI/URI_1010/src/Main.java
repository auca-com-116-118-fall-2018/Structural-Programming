import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        int code1 = scanner.nextInt();
        int numberOfUnits1 = scanner.nextInt();
        float price1 = scanner.nextFloat();

        int code2 = scanner.nextInt();
        int numberOfUnits2 = scanner.nextInt();
        float price2  = scanner.nextFloat();

        double total = numberOfUnits1 * price1 + numberOfUnits2 * price2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

    }
}