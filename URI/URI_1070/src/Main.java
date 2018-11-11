import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        for (int i = 0; i < 6; i++) {
            if (x % 2 == 0)
                x++;
            System.out.println(x + i*2);
        }
    }
}