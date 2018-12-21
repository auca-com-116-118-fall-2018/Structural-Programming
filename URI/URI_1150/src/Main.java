import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int z = scan.nextInt();

        while (z <= x) {
            z = scan.nextInt();
        }
        int sum = x;
        int count = 1;

        while (sum <= z) {
            sum += x;
            ++x;
            ++count;
        }

        System.out.println(count);
    }
}