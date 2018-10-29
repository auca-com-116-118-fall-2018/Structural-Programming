import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1st int?");
        int firstOperand = scanner.nextInt();
        System.out.print("2nd int?");
        int secondOperand = scanner.nextInt();

        int sum = firstOperand + secondOperand;
        System.out.println(firstOperand + "+" + secondOperand + "=" + sum );
     }
}

