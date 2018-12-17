import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float score, validScoreCount = 0, sum = 0, med = 0;
        while (validScoreCount != 2) {
            score = scanner.nextFloat();
            if (score >= 0 && score <= 10.0) {
                validScoreCount++;
                sum += score;
            } else
                System.out.println("nota invalida");
            }
        med = sum / 2;
        System.out.printf("media = %.2f%n", med);
    }
}
