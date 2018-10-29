import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1st number? ");
        int a = scan.nextInt();

        System.out.print("2nd number? ");
        int b = scan.nextInt();

        System.out.print("3rd number? ");
        int c = scan.nextInt();

        if (a >=b && a>=c){
            System.out.printf("The value %d is the greatest one.", a);
        }

        if (b >=a && b>=c){
            System.out.printf("The value %d is the greatest one.", b);

            }
        if (c>=a && c>=b){
            System.out.printf("The value %d is the greatest one.", c);

        }
    }
}
