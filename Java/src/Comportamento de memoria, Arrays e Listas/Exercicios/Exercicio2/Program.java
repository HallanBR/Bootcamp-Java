package Exercicios.Exercicio2;

import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        //Cria os arrays das respectivas variaveis e aloca espaço em "n"
        String[] nome = new String[n];
        int[] idade = new int [n];
        double[] altura = new double [n];

        //armazenas os dados nas respectivas variaveis
        for (int i=0; i<n; i++){
            System.out.println("Dados da "+ (i+1) + "a pessoa");

            System.out.print("Nome: ");
            nome[i] = sc.next();

            System.out.print("idade: ");
            idade[i] = sc.nextInt();

            System.out.print("altura: ");
            altura[i] = sc.nextDouble();
        }

        // Conta a quantidade de pessoas
        double soma = 0.0;
        for (int i=0; i<n; i++){
            soma = soma + altura[i];
        } 
        
        // Retorna a media da altura dessas pessoas
        double mediaAlturas = soma / n;

        System.out.println();


        System.out.printf("ALtura media: %.2f%n", mediaAlturas);

        // Conta as pessoas menores de 16
        int cont = 0;
        for (int i=0; i<n; i++){
            if (idade[i] < 16){
                cont = cont + 1;
            }
        } 
        // Calculo usado para calcular porcentagem do numero de pessoas com idade menor que 16
        double porcentagem = cont * 100.0 / n;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

        // Imprime a quantidade de pessoas dentro do array com idade menor que 16
        for (int i=0; i<n; i++){
            if (idade[i] <16){
                System.out.println(nome[i]);
            }
        }

        sc.close();
    }
    
}
