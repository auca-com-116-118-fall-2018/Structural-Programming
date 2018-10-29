import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("some real number? ");
        double a = scan.nextDouble();

        if (a < 0) {
            double res = a*(-1);
            System.out.println("|"+a+"|"+" = " +res);
        } else if (a>0){
            System.out.println("|"+a+"|"+" = " +a);
        }
    }
}
