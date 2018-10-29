import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int d = scanner.nextInt();
        int year = d / 365;
        int month = (d % 365) / 30;
        int day = (d % 365) % 30;

        System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n", year, month, day);
    }
}
