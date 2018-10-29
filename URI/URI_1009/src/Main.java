import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        double fixedSalary = scanner.nextDouble();
        double salesMadeInAMonth = scanner.nextDouble();
        double finalSalary = fixedSalary + salesMadeInAMonth * 0.15;

        String total = String.format("TOTAL = R$ %.2f", finalSalary);
        System.out.println(total);

    }
}
