import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int evenNumbers = 0;
        for (int i = 0; i < 5; ++i) {
            double number = scan.nextInt();
            if (number % 2 == 0) {
                ++evenNumbers;
            }
        }
        System.out.println(evenNumbers + " valores pares");
    }
}
