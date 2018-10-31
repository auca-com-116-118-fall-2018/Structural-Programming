import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        float n1 = scanner.nextFloat();
        float n2 = scanner.nextFloat();
        float n3 = scanner.nextFloat();
        float n4 = scanner.nextFloat();
        float average = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / (2 + 3 + 4 +1);
        System.out.printf("Media: %.1f%n", average);

        if (average >= 7.0) {
            System.out.printf("Aluno aprovado.%n");
        }
        else if (average < 5.0) {
            System.out.printf("Aluno reprovado.%n");
        } else {
            System.out.printf("Aluno em exame.%n");
            float n5 = scanner.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", n5);
            float average2 = (average + n5) / 2;
            if (average2 >= 5.0) {
                System.out.printf("Aluno aprovado.%n", average2);
            }
            else if (average <= 4.9) {
                System.out.printf("Aluno reprovado.%n", average2);
            }
            System.out.printf("Media final: %.1f%n", average2);
        }

    }
}
