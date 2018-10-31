import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        double a, b, c;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        double A = 0, B = 0, C = 0;

        if (a >= b && b >= c && a >= c) {
            A = a;
            B = b;
            C = c;
        } else if (a >= b && c >= b && a >= c) {
            A = a;
            B = c;
            C = b;
        } else if  (b >= a && b >= c && a >= c) {
            A = b;
            B = a;
            C = c;
        }  else if  (b >= a && b >= c && a <= c) {
            A = b;
            B = c;
            C = a;
        }  else if  (c >= a && c >= b && b >= a) {
            A = c;
            B = b;
            C = a;
        }   else if  (c >= a && c >= b && a >= b) {
            A = c;
            B = a;
            C = b;
        }

        if (A > 0 && B > 0 && C > 0) {
            if (A >= B + C) {
                System.out.printf("NAO FORMA TRIANGULO%n");

            }
            if (A * A == B * B + C * C) {
                System.out.printf("TRIANGULO RETANGULO%n");

            }
            if (A * A > B * B + C * C && A != B + C && A < B + C) {
                System.out.printf("TRIANGULO OBTUSANGULO%n");

            }
            if (A * A < B * B + C * C) {
                System.out.printf("TRIANGULO ACUTANGULO%n");

            }
            if (A == B && B == C) {
                System.out.printf("TRIANGULO EQUILATERO%n");
            }
            if ((A == B && B != C) || (B == C && C != A) || (A == C && C != B)) {
                System.out.printf("TRIANGULO ISOSCELES%n");
            }

        }

    }
}
