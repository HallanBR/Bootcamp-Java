package Exercicios.Exercicio1;
import java.util.Scanner;


public class Program {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de numeros que deseja armazenar: ");
        int numeros = sc.nextInt();

        /*
        Criando um vetor no qual a quantidade de memorias 
        que serao utilizadas, e a mesma dos numeros digitados
        */
        int [] vect = new int [numeros];

        //armazenando os numeros dos vetores nas memorias
        for (int i=0; i<numeros; i++){
            System.out.println("digite um numero: ");
            vect [i] = sc.nextInt();
        }

        System.out.println("Numeros negativos: ");

        //Imprimindo o numeros dos vetores nas memorias
        for (int i=0; i<numeros; i++){
            if (vect[i] < 0) {
                System.out.printf("%d\n", vect[i]);
                
            }
        }






        sc.close();
    }
}
