import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int a, b, c, d, e, f, g;
        a = n / 100;
        b = n % 100 / 50;
        c = n % 100 % 50 / 20;
        d = n % 100 % 50 % 20 / 10;
        e = n % 100 % 50 % 20 % 10 / 5;
        f = n % 100 % 50 % 20 % 10 % 5 / 2;
        g = n % 100 % 50 % 20 % 10 % 5 % 2 / 1;

        System.out.printf("%d%n", n);
        System.out.printf("%d nota(s) de R$ 100,00%n", a);
        System.out.printf("%d nota(s) de R$ 50,00%n", b);
        System.out.printf("%d nota(s) de R$ 20,00%n", c);
        System.out.printf("%d nota(s) de R$ 10,00%n", d);
        System.out.printf("%d nota(s) de R$ 5,00%n", e);
        System.out.printf("%d nota(s) de R$ 2,00%n", f);
        System.out.printf("%d nota(s) de R$ 1,00%n", g);

    }
}
