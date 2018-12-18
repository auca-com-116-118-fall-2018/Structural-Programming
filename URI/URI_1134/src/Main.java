import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x, alcohol = 0, gasolina = 0, diesel = 0;
        do {
            x = scanner.nextInt();
            if (x == 1) {
                alcohol++;
            }
            if (x == 2) {
                gasolina++;
            }
            if (x == 3) {
                diesel++;
            }
        } while (x != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcohol: " + alcohol);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
