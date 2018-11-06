import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        float sal = scan.nextFloat();


        if (sal > 0 && sal <= 400.00) {
            System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 15 %%\n", sal * 1.15, sal * 0.15);
        }
        else if (sal >= 400.01 && sal <= 800.00) {
            System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 12 %%\n", sal * 1.12, sal * 0.12);
        }
        else if (sal >= 800.01 && sal <= 1200.00) {
            System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 10 %%\n", sal * 1.10, sal * 0.10);
        }
        else if (sal >= 1200.01 && sal <= 2000.00) {
            System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 7 %%\n", sal * 1.07, sal * 0.07);
        }
        else if (sal > 2000.00) {
            System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 4 %%\n", sal * 1.04, sal * 0.04);
        }
    }
}
