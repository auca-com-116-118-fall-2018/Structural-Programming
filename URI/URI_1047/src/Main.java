import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, c, d;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();

        int timeHour = c - a;
        int timeMin = d - b;

        if (timeHour < 0) {
            timeHour = 24 + (c - a);
        }
        if (timeMin < 0) {
            timeMin = 60 + (d - b);
            timeHour--;
        }

        if (a == c && b == d) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", timeHour, timeMin);
        }
    }
}