import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int evenCount = 0, oddCount = 0;
        int positiveCount = 0, negativeCount = 0;

        for (int i = 1; i <= 5; i++) {
            int number = scan.nextInt();
            if (number > 0) {
                positiveCount++;
            }
            if (number < 0) {
                negativeCount++;
            }
            if (number % 2 == 0) {
                evenCount++;
            }
            if (number % 2 != 0) {
                oddCount++;
            }

        }
        System.out.print(evenCount + " valor(es) par(es)\n");
        System.out.print(oddCount + " valor(es) impar(es)\n");
        System.out.print(positiveCount + " valor(es) positivo(s)\n");
        System.out.print(negativeCount + " valor(es) negativo(s)\n");
    }
}
