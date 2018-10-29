import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1st number? ");
        int a = scan.nextInt();

        System.out.print("2nd number? ");
        int b = scan.nextInt();

        if (a > b) {
            System.out.printf("The first number (%d) is the greater than second (%d).", a, b);
        }


        if (b > a) {
            System.out.printf("The second number (%d) is the greater or equal to first (%d).", b, a);
        }

    }
}
