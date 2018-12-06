import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int highest = 0; int position = 0;
        int valueCount = 100;

        for (int i = 1; i <= valueCount; i++) {
            int value = scanner.nextInt();

            if (highest > value) {
                highest = highest;
                position = position;
            } else {
                highest = value;
                position = i;
            }
        }

        System.out.println(highest + "\n" + position);
    }
}
