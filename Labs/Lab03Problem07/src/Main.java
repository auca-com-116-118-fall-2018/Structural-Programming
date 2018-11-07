import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String today;
        String futureDay;

        System.out.print("Enter today's day: ");
        int day = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();

        if (day == 0)
            today = "Sunday";
        else if (day == 1)
            today = "Monday";
        else if (day == 2)
            today = "Tuesday";
        else if (day == 3)
            today = "Wednesday";
        else if (day == 4)
            today = "Thursday";
        else if (day == 5)
            today = "Friday";
        else
            today = "Saturday";

        int future = (day + elapsed) % 7;

        if (future == 0)
            futureDay = "Sunday";
        else if (future == 1)
            futureDay = "Monday";
        else if (future == 2)
            futureDay = "Tuesday";
        else if (future == 3)
            futureDay = "Wednesday";
        else if (future == 4)
            futureDay = "Thursday";
        else if (future == 5)
            futureDay = "Friday";
        else
            futureDay = "Saturday";

        System.out.println("Today is " + today + " and the future day is " + futureDay);
    }
}