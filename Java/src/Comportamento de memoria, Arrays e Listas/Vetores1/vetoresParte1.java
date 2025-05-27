package Vetores1;
import java.util.Scanner;

public class vetoresParte1 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        // Lê o tamanho do vetor
        System.out.println("Digite a quantidade de numeros que deseja armazenar: ");
        int n = sc.nextInt();
        double [] vect = new double[n];

        // Lê os valores e armazena no vetor
        for (int i=0; i<n; i++){
            vect [i] = sc.nextDouble();
        }


        double soma = 0.0;
        // Soma todos os valores do vetor
        for (int i=0; i<n; i++){
            soma += vect[i];
        }
        
        // Calcula a média
        double media = soma / n;

        // Exibe a média
        System.out.println("A media e : " + media);

        sc.close();
    }
}
