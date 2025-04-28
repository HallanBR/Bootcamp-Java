import java.util.Scanner;

public class Exercicio5 {
    
    public static void main(String[] args){

        // Cria um objeto Scanner para leitura de dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Lê a quantidade de números que o usuário deseja informar
        int n = scanner.nextInt(); 
        int entrada = 0; // Contador para números dentro do intervalo [10, 20]
        int saida = 0;   // Contador para números fora do intervalo [10, 20]

        // Loop para processar os números fornecidos pelo usuário
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt(); // Lê o próximo número

            // Verifica se o número está dentro do intervalo [10, 20]
            if (x >= 10 && x <= 20) {
                entrada++; // Incrementa o contador de números dentro do intervalo
            } else {
                saida++; // Incrementa o contador de números fora do intervalo
            }
        }

        // Exibe os resultados
        System.out.println("Total dentro do intervalo: " + entrada);
        System.out.println("Total fora do intervalo: " + saida);

        // Fecha o objeto Scanner
        scanner.close();
    }
}
