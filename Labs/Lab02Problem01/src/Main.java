import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1st value? ");
        int a = scan.nextInt();

        System.out.print("2nd value? ");
        int b = scan.nextInt();

        System.out.printf("Before swapping: a = %d; b = %d; %n", a, b);

        int t = a;
        a = b;
        b = t;

        System.out.printf("After swapping: a = %d; b = %d; %n", a, b);
    }
}
