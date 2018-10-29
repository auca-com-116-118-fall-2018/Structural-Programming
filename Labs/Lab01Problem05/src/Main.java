import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1st double? ");
        double a = scan.nextDouble();
        System.out.print("2st double? ");
        double b = scan.nextDouble();


        double sum = a + b;
        System.out.println(a + " + " + b + "  =" + sum);
        double dif = a - b;
        System.out.println(a + " - " + b + " = " + dif);
        double mul = a * b;
        System.out.println(a + " * " + b + " = " + mul);
        double div = a / b;
        System.out.println(a + " / " + b + " = " + div);
        double rem = a % b;
        System.out.println(a + " % " + b + " = " + rem);

    }
}
