import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Length in inches? ");
        double lengthInInches = scan.nextDouble();
        double lengthInCentimeters = lengthInInches * 2.54;
        System.out.printf("%.0f in. = %.2f cm.%n", lengthInInches, lengthInCentimeters);


    }
}
