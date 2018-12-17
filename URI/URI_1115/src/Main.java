import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int x, y;

        while (((x = scanner.nextInt())!= 0) && ((y = scanner.nextInt()) != 0)) {

            if (x > 0 && y > 0) {
                System.out.printf("primeiro%n");
            } else if (x > 0 && y < 0) {
                System.out.printf("quarto%n");
            } else if (x < 0 && y > 0) {
                System.out.printf("segundo%n");
            } else if (x < 0 && y < 0) {
                System.out.printf("terceiro%n");
            }

        }
    }
}
