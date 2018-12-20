import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = scan.nextInt();

        if (isPalindrome(input)) {
            System.out.print(input + "is a palindrome");
        } else {
            System.out.print(input + "is not a palindrome");
        }
    }

    public static int reverse(int input) {
        int reverse = 0;
        int number;

        do {
            number = input % 10;
            reverse = reverse * 10 + number;
            input /= 10;
        }
        while (input != 0);
        return reverse;
    }

    public static boolean isPalindrome(int input) {
        return (input == reverse(input));
    }
}