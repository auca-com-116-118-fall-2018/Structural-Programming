public class Main2 {
    public static void main(String[] args) {
        int sum = 0;

        // continue statement
        int number = 0;

        while (number < 20) {
            number++;
            if (number == 10 || number == 11)
                continue;
            sum += number;
        }

        System.out.println("The sum is " + sum);
    }
}