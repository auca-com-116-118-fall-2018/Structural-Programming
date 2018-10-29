import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature in degrees Fahrenheit? ");
        double degreesFahrenheit = scanner.nextDouble();

        double degreesCelsius = (degreesFahrenheit - 32) * 5 / 9;
        System.out.printf("The temperature in degrees Celsius is %.2f%n", degreesCelsius);


    }
}
