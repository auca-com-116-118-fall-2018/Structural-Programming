import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("complexity level? ");
        int lvl = scanner.nextInt();

        switch(lvl) {
            case 5:
            case 4:
                System.out.println("You are a pro gamer.");
                break;
            case 3:
            case 2:
                System.out.println("You are an experienced gamer");
                break;
            case 1:
                System.out.println("You are a pro beginner.");
                break;
            case 0:
                System.out.println("You are a total newbie.");
        }

    }
}
