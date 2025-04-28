import java.util.Scanner;

public class Para {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números você quer somar?");
        // Lê a quantidade de números a serem somados
        int N = scanner.nextInt();

        int soma = 0;

        for (int i=0; i < N; i++){
            System.out.println("Digite os números a serem somados:");
            int x = scanner.nextInt();
            soma = soma + x;
        }

        scanner.close();
        System.out.println("A soma dos numeros e: " + soma);
  
    }
}
