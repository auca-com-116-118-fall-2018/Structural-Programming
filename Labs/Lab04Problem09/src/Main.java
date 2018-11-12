import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three values of edges? ");
        int a, b, c, per;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        per = a + b + c;

        if (a + b > c && a + c > b && b + c > a)
            System.out.println("The perimeter is " + per);
        else
            System.out.println("The input is invalid.");
    }
}
