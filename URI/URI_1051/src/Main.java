import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float n, r, f1, f2, f3;
        n = scan.nextFloat();

        if (n > 0 && n <= 2000.00) {
            System.out.printf("Isento");
        } else {
            if (n >= 2000.01 && n <= 3000.00) {
                f1 = n - 2000;
                f1 = ((f1 * 8) / 100);
                r = f1;
            } else if (n >= 3000.01 && n <= 4500.00) {
                f1 = n - 2000;
                f2 = f1 - 1000;
                f1 -= f2;
                f1 = ((f1 * 8) / 100);
                f2 = ((f2 * 18) / 100);
                r = f2 + f1;
            } else {
                f1 = n - 2000;
                f2 = f1 - 1000;
                f3 = f2 - 1500;
                f1 -= f2;
                f2 -= f3;
                f1 = ((f1 * 8) / 100);
                f2 = ((f2 * 18) / 100);
                f3 = ((f3 * 28) / 100);
                r = f1 + f2 + f3;
            }
            System.out.printf("R$ %.2f%n", r);
        }
    }
}
