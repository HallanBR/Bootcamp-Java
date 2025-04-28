import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lê um número inteiro fornecido pelo usuário
        int x = scanner.nextInt();

        // Itera de 1 até o número fornecido pelo usuário
        for (int i = 1; i <= x; i++) {
            // Verifica se o número atual é ímpar
            if (i % 2 != 0) {
                // Imprime o número ímpar
                System.out.println(i);
            }
        }

        // Fecha o objeto Scanner para liberar recursos
        scanner.close();
    }
}
