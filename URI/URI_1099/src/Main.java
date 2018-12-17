import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x, y;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            x = scanner.nextInt();
            y = scanner.nextInt();

            if (x > y) {
                for (int j = x - 1; j > y; j--) {
                    if (j % 2 != 0)
                        sum += j;
                }
            } else if (x < y) {
                for (int j = x + 1; j < y; j++) {
                    if (j % 2 != 0)
                        sum += j;
                }
            } else {
                sum = 0;
            }

            System.out.println(sum);
        }
    }
}
