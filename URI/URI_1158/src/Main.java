import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){

            int x = scanner.nextInt();
            x = (x % 2 == 0) ? x+1 : x;
            int y = scanner.nextInt();
            int sum = 0;

            for(int j = 0; j < y; j++){
                sum += x;
                x += 2;
            }

            System.out.println(sum);

        }
    }
}
