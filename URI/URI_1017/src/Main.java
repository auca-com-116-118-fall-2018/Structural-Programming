import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int time = scanner.nextInt();
        int averageSpeed = scanner.nextInt();

        double fuelSpent = time * averageSpeed / 12.0;

        System.out.printf("%.3f\n", fuelSpent);
    }
}
