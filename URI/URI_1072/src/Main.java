import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int numbersIn = 0, numbersOut = 0;
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int x = scanner.nextInt();

            if (x >= 10 && x <= 20) {
                numbersIn++;
            } else {
                numbersOut++;
            }

        }

        System.out.println(numbersIn + " in\n" + numbersOut + " out");
    }
}
