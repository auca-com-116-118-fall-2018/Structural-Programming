import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();

        int t = (int) (dist / ((90 / 60.0) - (60 / 60.0)));

        System.out.printf("%d minutos\n", t);
    }

}