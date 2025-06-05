package Aplications;

import java.util.Scanner;

import entities.Alugado;


public class program {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        Alugado [] quartos = new Alugado [10];

        System.out.print("Quantos quartos serao alugados ? ");
        int quantidade = sc.nextInt();

         
        for( int i=1; i<=quantidade; i++){
            System.out.println();
            System.out.println("Alugado #" + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.next();
            
            System.out.print("Quarto: ");
            int numeroQuarto = sc.nextInt();

            // o vetor quartos recebe o numero do quartos e armazena os dados do cliente
            quartos[numeroQuarto] = new Alugado(name, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i=0; i<10; i++){
            // se quartos na posicao [i] for diferente de nulo, imprima
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i]);
            }
        }


        sc.close();
    }
    
}
