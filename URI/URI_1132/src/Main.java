import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int x, y, sum1 = 0, sum2 = 0;

        x = scanner.nextInt();
        y = scanner.nextInt();

        if (x > y) {
            for (int i = y; i <= x; i++) {
                if (i % 13 != 0) {
                    sum1 += i;
                }
            }
            System.out.println(sum1);
        } else {
            for (int i = x; i <= y; i++) {
                if (i % 13 != 0) {
                    sum2 += i;
                }
            }
            System.out.println(sum2);
        }
    }
}
