import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Year? ");

        int y = scan.nextInt();

        if (y % 400 == 0 || y % 4 == 0 && y % 100 !=0){
            System.out.println("This is a leap year.");
        } else {
            System.out.println("This is not a leap year.");
        }
    }
}
