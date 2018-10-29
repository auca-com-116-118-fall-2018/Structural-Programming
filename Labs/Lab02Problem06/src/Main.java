import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double a = scan.nextDouble();

        double b = ((9.0 / 5) * a + 32);
        System.out.printf("%.0f Celsius is %.1f Fahrenheit %n", a, b);
    }
}
