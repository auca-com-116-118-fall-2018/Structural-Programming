import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int numberOfHours = scanner.nextInt();
        float moneyPerHour = scanner.nextFloat();

        float sal = numberOfHours * moneyPerHour;

        System.out.println("NUMBER = " + number);

        String salary = String.format("SALARY = U$ %.2f", sal);
        System.out.println(salary);
    }
}
