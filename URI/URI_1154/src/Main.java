import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        float n = scanner.nextFloat(), sum = 0, total = 0, average;
        do {
            sum += n;
            n = scanner.nextInt();
            total++;

        } while (n >= 0);

        average = sum / total;
        System.out.printf("%.2f", average);
    }
}
