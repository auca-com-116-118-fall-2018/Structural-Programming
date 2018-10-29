import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;
        float radius = scanner.nextFloat();

        double sphereVolume = 4.0 / 3.0 * PI * radius * radius * radius;
        System.out.printf("VOLUME = %.3f%n", sphereVolume);
    }
}
