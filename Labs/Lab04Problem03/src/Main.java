import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("month? ");
        int month = scanner.nextInt();
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "autumn";
                break;
        }

        System.out.println(season);
    }
}
