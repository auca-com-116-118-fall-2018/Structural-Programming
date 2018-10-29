import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        final double pi = 3.14159;

        double radius = scan.nextDouble();
        double length = scan.nextDouble();

        double area = radius * radius * pi;
        double volume = area * length;

        System.out.printf("The area is %.4f %n", area);
        System.out.printf("The volume is %.1f", volume);

    }
}
