import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        double d = 0.1;
        double sum = d + d + d + d + d + d + d + d + d + d;

        if (sum == 1.0) {
          System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

    }
}
