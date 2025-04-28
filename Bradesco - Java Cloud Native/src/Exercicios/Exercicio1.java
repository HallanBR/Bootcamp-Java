import java.util.Scanner;
public class Exercicio1 {
 
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int x = scanner.nextInt();

        while (x != 2025) {        
            System.out.println("Senha Invalida");
            x = scanner.nextInt();
        }
    
        System.out.println("Acesso Permitido");
    scanner.close();
    }
    
}
