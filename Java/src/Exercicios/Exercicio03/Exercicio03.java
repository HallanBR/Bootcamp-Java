import java.util.Scanner;


public class Exercicio03 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome do aluno:");
        String nome;
        nome = scanner.nextLine();

        System.out.println("Insira o valor da nota do primeiro trimestre: ");
        int nota1;
        nota1= scanner.nextInt();

        System.out.println("Insira o valor da nota do segundo trimestre: ");
        int nota2;
        nota2 = scanner.nextInt();

        System.out.println("Insira o valor da nota do terceiro trimestre: ");
        int nota3;
        nota3 = scanner.nextInt();

        int pontos;
        pontos=nota1+nota2+nota3;

        int media;
        media=60;
        
        int faltantes;
        faltantes = media-pontos;

        if (pontos>=media){
            System.out.println("Aprovado");
        }
        else  {
            System.out.println("Reprovado");
            System.out.println("O aluno " + nome + " precisa de + " + faltantes + " pontos, para ser aprovado");
            
        }

        scanner.close();
    }
}
