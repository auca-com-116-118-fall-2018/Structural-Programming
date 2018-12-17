import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int x, y;
        do {
            x = scanner.nextInt();
            y = scanner.nextInt();
            if (x > y) {
                System.out.println("Decrescente");
            } else if (x < y) {
                System.out.println("Crescente");
            }
        } while (x != y);
    }
}
