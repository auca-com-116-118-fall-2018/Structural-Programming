import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        float a, b, med;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextFloat();
        b = scanner.nextFloat();

        med = (float)(((a * 3.5) + (b * 7.5)) / (3.5 + 7.5));
        String media = String.format("MEDIA = %.5f\n", med);

        System.out.println(media);
    }
}
