import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x,y;
        x = scan.nextDouble();
        y = scan.nextDouble();

        double distance = Math.sqrt((x * x)+(y * y));
        double distanceFinal = Math.abs(distance);

        if (distanceFinal<= 10) {
            System.out.print("Point ("+x+", "+y+") is in the circle");
        } else System.out.print("Point ("+x+", "+y+") is not in the circle");
    }
}
