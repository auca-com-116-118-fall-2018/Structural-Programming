import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("month? ");
        int number = scanner.nextInt();
        String month;

        if (number == 12 || number == 1 || number == 2)
            month = "winter";
        else if (number >= 3 && number <= 5)
            month = "spring";
        else if (number >= 6 && number <= 8)
            month = "summer";
        else
            month = "autumn";

        System.out.println(month);
    }
}
