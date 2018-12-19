import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, i, fact = 1;
        n = scanner.nextInt();
        for (i = n; i >= 1; i--) {
            fact = fact * i;
        }

        System.out.println(fact);
    }
}
