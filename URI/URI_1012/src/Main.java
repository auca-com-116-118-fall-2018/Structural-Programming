import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        double triangleArea = a * c / 2;
        double circleArea = PI * c * c;
        double trapeziumArea = (a + b) * c / 2;
        double squareArea = b * b;
        double rectangleArea = a * b;

        System.out.printf("TRIANGULO: %.3f%n", triangleArea);
        System.out.printf("CIRCULO: %.3f%n", circleArea);
        System.out.printf("TRAPEZIO: %.3f%n", trapeziumArea);
        System.out.printf("QUADRADO: %.3f%n", squareArea);
        System.out.printf("RETANGULO: %.3f%n", rectangleArea);
    }
}
