import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int[] n = new int[10];

        for (int i = 0; i < 10; i++) {
            n[i] = x;
            x *= 2;

            System.out.printf("N[%d] = %d%n", i, x);
        }
    }
}
