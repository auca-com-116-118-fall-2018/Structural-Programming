import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

        float number, total = 0, average = 0;
        int totalNumber = 0;
        Scanner sc =new Scanner(System.in);
        for (int i = 1; i <= 6; i++) {
            number =sc.nextFloat();
            if (number > 0) {
                totalNumber += 1;
                total += number;
            }
        }
        average = total / totalNumber;

        System.out.print(totalNumber + " valores positivos\n");
        System.out.printf("%.1f\n", average);

    }

}
