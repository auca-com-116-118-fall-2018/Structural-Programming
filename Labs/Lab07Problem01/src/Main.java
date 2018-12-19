import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("N: ");
        int n = scanner.nextInt();

        int[] counters = new int[11];
        for (int i = 0; i < n; ++i){
            int dice1 = random(1,6);
            int dice2 = random(1,6);

            int sum = dice1 + dice2;
            ++counters[sum - 2];
        }

        for (int i = 0; i < counters.length; ++i) {
            System.out.printf("%d: %d%n", i + 2, counters[i]);
        }
    }

    public static int random(int min, int max) {
        return (int)(min + Math.random() * (max + 1 - min));
    }
}
