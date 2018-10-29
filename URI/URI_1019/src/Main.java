import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int hour = N / 3600;
        int min = (N % 3600) / 60;
        int sec = (N % 3600) % 60;

        System.out.println(hour + ":" + min + ":" + sec);
    }
}
