import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner (System.in);

        float a, b, c;
        a = scan.nextFloat();
        b = scan.nextFloat();
        c = scan.nextFloat();

        float per = a + b + c;
        float area = ((a + b) * c) / 2;

        if (a + b > c && a + c > b && b + c > a) {
            System.out.printf("Perimetro = %.1f%n", per);
        } else {
            System.out.printf("Area = %.1f%n", area);
        }
    }
}
