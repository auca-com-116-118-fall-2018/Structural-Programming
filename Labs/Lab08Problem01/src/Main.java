import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Rows? ");
        int rows = scan.nextInt();

        System.out.print("Columns? ");
        int columns = scan.nextInt();

        int[][] a = new int[rows][columns];

        System.out.printf("Enter %d rows and %d columns\n", rows, columns);

        Array2D(a);
        System.out.printf("Sum of all elements is %d",sum(a));


    }

    private static void Array2D(int[][] a) {
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                a[r][c] = scan.nextInt();
            }
        }
    }


    private static long sum(int[][] a) {
        long result =0;
        for (int[] r:a){
            for (int e: r){
                result+=e;
            }
        }
        return result;
    }
}