import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double years = scan.nextDouble();
        double currentPopulation = 312032486;
        double secondsInYears = years * 60 * 60 * 24 * 365;
        double births = secondsInYears / 7.0;
        double deaths = secondsInYears / 13.0;
        double immigrants = secondsInYears / 45.0;

        currentPopulation += (immigrants + births - deaths);
        System.out.printf("The population in 5 years is %.0f", currentPopulation);


    }
}

