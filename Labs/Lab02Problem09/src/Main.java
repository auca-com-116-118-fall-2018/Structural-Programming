import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        double minutes = scan.nextDouble();

        double years = minutes / 525600;

        double remaining = minutes % 525600;
        double days = remaining / 1440;
        System.out.printf("%.0f minutes is approximately %.0f years and %.0f days", minutes, years, days);

    }
}
