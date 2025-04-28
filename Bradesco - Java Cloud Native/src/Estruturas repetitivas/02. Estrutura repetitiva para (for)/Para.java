import java.util.Scanner;

public class Para {
    public static void main(String[] args){

        // Cria um objeto Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a quantidade de números que deseja somar
        System.out.println("Quantos números você quer somar?");
        int N = scanner.nextInt(); // Lê a quantidade de números a serem somados

        int soma = 0; // Inicializa a variável que armazenará a soma dos números

        // Loop para ler os números e calcular a soma
        for (int i = 0; i < N; i++) {
            System.out.println("Digite os números a serem somados:");
            int x = scanner.nextInt(); // Lê o próximo número
            soma = soma + x; // Adiciona o número à soma
        }

        // Fecha o objeto Scanner para liberar recursos
        scanner.close();

        // Exibe o resultado da soma
        System.out.println("A soma dos numeros e: " + soma);
    }
}
