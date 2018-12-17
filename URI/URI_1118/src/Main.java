import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int validScoreCount;
        double x, sum, score;
        do {
            validScoreCount = 0;
            sum = 0;
            while (validScoreCount < 2) {
                score = scanner.nextDouble();
                if (score >= 0 && score <= 10) {
                    sum += score;
                    validScoreCount++;
                } else {
                    System.out.println("nota invalida");
                }
            }
            System.out.printf("media = %.2f\n", sum / 2f);
            do {
                x = scanner.nextDouble();
                System.out.println("novo calculo (1-sim 2-nao)");
            } while (x != 1 && x != 2);
        } while (x != 2);
        System.out.close();
    }
}