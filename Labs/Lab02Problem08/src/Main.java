import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        final double pound = 0.454;

        double a = scan.nextDouble();

        double kilograms = a * pound;

        System.out.printf("%.1f pounds is %.3f kilograms", a, kilograms);
    }
}
