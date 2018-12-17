import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        int n, m;

        Scanner scanner = new Scanner(System.in);

        while (((n = scanner.nextInt()) > 0) && ((m = scanner.nextInt()) > 0)) {
            int sum =  0;
            if (m > n) {
                for (n = n; n <= m; n++) {
                    sum += n;
                    System.out.print(n + " ");
                }
                System.out.print("Sum=" + sum + "\n");
            } else {
                for (m = m; m <= n; m++) {
                    sum += m;
                    System.out.print(m + " ");
                }
                System.out.print("Sum=" + sum + "\n");
            }
        }
    }
}
