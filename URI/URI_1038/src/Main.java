import java.util.Scanner;

public class Main {
    public static void main(String [] args){
         Scanner sc = new Scanner(System.in);

         int x = sc.nextInt();
         int y = sc.nextInt();
         double price = 0;

         if (x == 1) {
             price = 4.00 * y;
         } else if (x == 2) {
             price = 4.50 * y;
         } else if (x == 3) {
             price = 5.00 * y;
         } else if (x == 4) {
             price = 2.00 * y;
         } else if (x == 5) {
             price = 1.50 * y;
         }

         System.out.printf("Total: R$ %.2f\n", price);

    }
}
