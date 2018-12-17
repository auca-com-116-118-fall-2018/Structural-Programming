import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        int x, y;
        float div;
        Scanner input =new Scanner(System.in);

        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            x = input.nextInt();
            y = input.nextInt();

            if (y == 0) {
                System.out.print("divisao impossivel\n");
            }else {
                div =(float) x / y;
                System.out.printf("%.1f\n", div);
            }
        }
    }
}
