import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of points? ");
        int points = scan.nextInt();

        if(points>= 90 && points<=100){
            System.out.print("Grade: A");
        }
        if (points>=80 && points<90){
            System.out.print("Grade: B");
        }
        if (points>=70 && points <80){
            System.out.print("Grade: C");
        }
        if (points>=60 && points<70){
            System.out.print("Grade: D");
        }
        if (points<60 && points >= 0){
            System.out.print("Grade: F");

        } else if (points > 100 || points < 0) {
            System.out.printf("%d is not in the permitted range.\n", points);
        }
    }
}
