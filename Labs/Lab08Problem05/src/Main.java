import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter matrix 1: ");
        double a = scan.nextDouble();

        System.out.print("Enter matrix 2: ");
        double b = scan.nextDouble();

        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];

        readMatrix(matrix1);
        readMatrix(matrix2);

        double doneMatrix[][] = new double[3][3];

        System.out.print("The multiplication of the matrices is: ");

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%2d", matrix1[i][j]);
            }
            System.out.print(i != 1 ? "    " : " * ");
            for (int j = 0; j < 3; j++) {
                System.out.printf("%2d", matrix2[i][j]);
            }
            System.out.print(i != 1 ? "   " : " = ");
            for (int j = 0; j < 3; j++) {
                System.out.printf("%2d", product(matrix1, matrix2, doneMatrix));
            }
        }
        System.out.println();

    }

    private static void readMatrix(double[][] a) {
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                a[r][c] = scan.nextInt();
            }
        }
    }


    private static double product(double[][] matrix1, double[][] matrix2, double[][] doneMatrix) {
        double multiplication = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                doneMatrix[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    doneMatrix[i][j] += matrix1[i][k] * matrix1[k][j];
                }

            }

        }
        return multiplication;
    }
}
