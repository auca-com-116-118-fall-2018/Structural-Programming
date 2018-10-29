import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;

        double radius = scanner.nextDouble();
        double a = PI * radius * radius;

        System.out.printf("A=%.4f%n", a);

    }
}
