import java.util.Scanner;

public class FacaEnquanto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char opcao; // Variável para armazenar a opção do usuário
        do {
            // Solicita ao usuário a temperatura em Celsius
            System.out.println("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();

            // Converte a temperatura de Celsius para Fahrenheit
            double F = 9.0 * C / 5.0 + 32.0;

            // Exibe a temperatura convertida em Fahrenheit
            System.out.printf("A temperatura em Fahrenheit é ", F);

            // Pergunta ao usuário se deseja continuar
            System.out.printf("Deseja continuar? (S/N)? ");
            opcao = sc.next().charAt(0); // Lê a primeira letra da entrada do usuário
        } while (opcao != 'n'); // Continua enquanto o usuário não digitar 'n'

        // Fecha o objeto Scanner para liberar recursos
        sc.close();

        // Mensagem final indicando que o programa foi encerrado
        System.out.println("Programa encerrado.");
    }
}
