import java.util.Scanner;
import entities.Product;

public class vetoresParte2 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        // Lê o número de produtos a serem cadastrados
        int n = sc.nextInt();
        Product[] vect = new Product [n];

        // Lê os dados de cada produto e armazena no vetor
        for (int i=0; i<n; i++){
            sc.nextLine(); // Consome a quebra de linha pendente
            String name = sc.nextLine(); // Lê o nome do produto
            double price = sc.nextDouble(); // Lê o preço do produto
            vect[i] = new Product (name, price); // Cria e armazena os produtos no vetor
        }

        double sum = 0.0;
        // Soma os preços de todos os produtos
        for (int i=0; i<n; i++){
            sum += vect[i].getPrice();
        }

        // Calcula a média dos preços
        double avg = sum / n;

        // Exibe a média formatada com duas casas decimais
        System.out.printf("AVERAGE PRICE: %.2f%n", avg);

        sc.close(); // Fecha o scanner
    }
}
