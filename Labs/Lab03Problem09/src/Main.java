import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int input = scanner.nextInt();
        int computer = (int)(Math.random()*3);

        if (input == 0){

            if (computer == 0){
                System.out.println("The computer is scissor. You are scissor too. It is a draw");
            } else if (computer == 1){
                System.out.println("The computer is rock. You are scissor. You lost");
            } else if (computer == 2){
                System.out.println("The computer is paper. You are scissor. You won");
            }
        } else if (input == 1){
            if (computer == 0){
                System.out.println("The computer is scissor. You are rock. You won");
            } else if (computer == 1){
                System.out.println("The computer is rock. You are rock too. It is a draw");
            } else if (computer == 2){
                System.out.println("The computer is paper. You are rock. You lost");
            }
        } else if (input == 2){
            if (computer == 0){
                System.out.println("The computer is scissor. You are paper. You lost");
            } else if (computer == 1){
                System.out.println("The computer is rock. You are paper. You won");
            } else if (computer == 2){
                System.out.println("The computer is paper. You are paper too. It is a draw");
            }
        }
    }
}
