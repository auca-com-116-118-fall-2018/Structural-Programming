import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int password;
        do {
            password = scanner.nextInt();
            if (password != 2002 ) {
                System.out.println("Senha Invalida");
            }
        } while (password != 2002);
            if (password == 2002) {
                System.out.println("Acesso Permitido");
            }
    }
}
