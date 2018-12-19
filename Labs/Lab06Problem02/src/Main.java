import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Year? ");
        int year = scanner.nextInt();

        System.out.print("Month? ");
        int month = scanner.nextInt();

        int numberOfDays = getNumberOfDays(year, month);
        if (numberOfDays == -1) {
            System.err.println("Invalid");
            System.exit(-1);
        } else {
            System.out.println("The number of days: " + numberOfDays);
        }
    }

    public static boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static int getNumberOfDays(int year, int month) {
        int days;

        switch (month){
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                days = isLeapYear(year) ? 29 : 28;
                break;
            default:
                days = -1;
                break;
        }

        return days;
    }
}
