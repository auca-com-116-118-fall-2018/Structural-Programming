import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("A four-digit integer? ");
        int a = scan.nextInt();
        int s = 0;
        s += a % 10;
        a /= 10;

        s += a % 10;
        a /= 10;

        s += a % 10;
        a /= 10;

        s += a % 10;
        a /= 10;

        System.out.print("The sum of all digits is " + s);
    }
}
