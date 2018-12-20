
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int sum = 0, j = 0;
        while (x != 0) {
            for (int i = x; j < 5; ++i) {
                if (i % 2 == 0) {
                    sum += i;
                    j++;
                }
            }
            System.out.println(sum);
            sum = 0;
            j = 0;
            x = input.nextInt();
        }
    }
}
