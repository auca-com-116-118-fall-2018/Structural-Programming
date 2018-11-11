import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; ++i) {
            int number = scanner.nextInt();
            if (number == 0) {
                System.out.println("NULL");
            } else if (number > 0 && number % 2 != 0) {
                System.out.println("ODD POSITIVE");
            } else if (number < 0 && number % 2 == 0 ) {
                System.out.println("EVEN NEGATIVE");
            } else if (number < 0 && number % 2 != 0) {
                System.out.println("ODD NEGATIVE");
            } else if (number > 0 && number % 2 == 0) {
                System.out.println("EVEN POSITIVE");
            }
        }
    }
}
