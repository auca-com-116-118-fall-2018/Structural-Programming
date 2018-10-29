import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        float y = scanner.nextFloat();

        double averageCounsumption = x / y;

        System.out.printf("%.3f km/l%n", averageCounsumption);

    }
}
