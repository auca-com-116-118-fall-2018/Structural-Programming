import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if (n == 61) {
            System.out.println("Brasilia\n");
        }
        else if (n == 71) {
            System.out.println("Salvador\n");
        }
        else if (n == 11) {
            System.out.println("Sao Paulo\n");
        }
        else if (n == 21) {
            System.out.println("Rio de Janeiro\n");
        }
        else if (n == 32) {
            System.out.println("Juiz de Fora\n");
        }
        else if (n == 19) {
            System.out.println("Campinas\n");
        }
        else if (n == 27) {
            System.out.println("Vitoria\n");
        }
        else if (n == 31) {
            System.out.println("Belo Horizonte\n");
        }
        else {
            System.out.println("DDD nao cadastrado\n");
        }
    }
}
