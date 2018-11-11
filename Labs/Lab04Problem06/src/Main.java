import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x, y;
        x = scanner.nextInt();
        y = scanner.nextInt();

        if (x <= 10 / 2 && y <= 5.0 / 2) {
            System.out.println("Point (" +x+ ", " +y+ ") is in the rectangle");
        } else {
            System.out.println("Point (" +x+ ", " +y+ ") is not in the rectangle");
        }
    }
}
