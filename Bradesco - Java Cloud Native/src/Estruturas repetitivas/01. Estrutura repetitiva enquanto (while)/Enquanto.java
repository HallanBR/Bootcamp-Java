import java.util.Scanner;
public class Enquanto {

    public static void main(String[] args) {
        // Estrutura repetitiva enquanto (while)
        // A estrutura repetitiva enquanto (while) executa um bloco de código enquanto uma condição for verdadeira.

       
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int soma = 0;

        while (x != 0) {
            soma = soma + x;
            x = scanner.nextInt();
        }

        // O loop acima solicita que o usuario insira numeros diferentes de 0
        // A condição do loop é x != 0, então o loop continua enquanto x for diferente 0.
        // A cada iteração, o valor de x é incrementado em soma.
        // Quando o usuario digita 0, a condição se torna falsa e o loop termina.

       System.out.println("A soma dos números é: " + soma);

        // Exibe a soma dos números digitados pelo usuário
        // O loop continua até que o usuário digite 0, momento em que a soma é exibida e o programa termina.

        scanner.close();
    }
}
