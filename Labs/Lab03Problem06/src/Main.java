import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c, r1, r2;
        System.out.println("Enter a, b, c: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        double discr = Math.pow(b, 2) - 4 * a * c;

        if (discr > 0) {
            r1 = (-b + Math.sqrt(discr)) / 2 * a;
            r2 = (-b - Math.sqrt(discr)) / 2 * a;
            System.out.printf("The equation has two roots %f and %f", r1, r2);
        }
        else if (discr == 0) {
            r1 = - b / 2 * a;
            System.out.printf("The equation has one root %f", r1);
        }
        else {
            System.out.println("The equation has no real roots");
        }
    }
}
