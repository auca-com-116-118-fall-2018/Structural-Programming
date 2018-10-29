import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maior = a;

        if (a < b || a < c) {
            if (b < c) {
                maior = c;
            } else {
                maior = b;
            }
        }

        System.out.printf("%d eh o maior%n", maior);
    }
}
