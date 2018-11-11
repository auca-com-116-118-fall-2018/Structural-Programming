import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n >= 5 && n <= 2000) {
            for (int i = 2; i <= n; i+= 2) {
            System.out.println(i + "^2" + " = " + (i * i));
            }
        }
    }
}
