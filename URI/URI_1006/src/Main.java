import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        float a, b, c, med;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();

        med = (float)(((a * 2) + (b * 3) + (c * 5)) / (2 + 3 + 5));
        String media = String.format("MEDIA = %.1f", med);

        System.out.println(media);
    }
}
