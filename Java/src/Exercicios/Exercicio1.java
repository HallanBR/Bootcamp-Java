import java.util.Scanner;
public class Exercicio1 {
 
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a senha: ");
        // Solicita ao usuario que digite a senha
        // A senha correta é 2025

    int x = scanner.nextInt();
        // Escaneia o valor digitado pelo usuario e armazena em x

        while (x != 2025) {        
            System.out.println("Senha Invalida");
            System.out.println("Digite a senha novamente: ");
            x = scanner.nextInt();
        }
        // Cria um loop que continua enquanto o valor de x for diferente de 2025
        // se o usuario digitar um valor diferente de 2025, exibe senha invalida
        // e solicita que o usuario digite a senha novamente
        // Quando o usuario digita 2025, o loop termina e o programa continua
    
        System.out.println("Acesso Permitido");
        // Exibe mensagem de acesso permitido

    scanner.close();
    }
    
}
