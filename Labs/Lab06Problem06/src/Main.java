import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Write an integer: ");
        int input = scan.nextInt();

        System.out.println("The sum is " + sumDigits(input));
    }

    private static int sumDigits(long n) {
        int res = 0;
        while (n > 0) {
            res += n % 10;
            n /= 10;
        }
        return res;
    }
}
