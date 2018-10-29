import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int a, b, c, d;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        if((b > c) && (d > a) && (c + d > a + b) && c > 0 && d > 0 && (a % 2 == 0))
            System.out.printf("Valores aceitos\n");
        else
            System.out.printf("Valores nao aceitos\n");

    }

}
