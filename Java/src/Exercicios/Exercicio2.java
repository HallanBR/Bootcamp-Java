import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[] args) {

        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o valor de X
        System.out.println("Digite o valor de X:");
        int x = scanner.nextInt();

        // Solicita ao usuário o valor de Y
        System.out.println("Digite o valor de Y:");
        int y = scanner.nextInt();

        // Cria um loop que continua enquanto X e Y forem diferentes de 0
        while (x != 0 && y != 0) {

            // Verifica em qual quadrante os valores de X e Y estão
            if (x > 0 && y > 0) {
                System.out.println("primeiro quadrante"); // Quadrante 1: X positivo, Y positivo
            } else if (x < 0 && y > 0) {
                System.out.println("segundo quadrante"); // Quadrante 2: X negativo, Y positivo
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro quadrante"); // Quadrante 3: X negativo, Y negativo
            } else {
                System.out.println("quarto quadrante"); // Quadrante 4: X positivo, Y negativo
            }

            // Solicita novamente os valores de X e Y para continuar o loop
            System.out.println("Digite o valor de X:");
            x = scanner.nextInt();
            System.out.println("Digite o valor de Y:");
            y = scanner.nextInt();
        }

        // Mensagem exibida quando o loop termina (X ou Y é igual a 0)
        System.out.println("Programa encerrado");

        // Fecha o objeto Scanner para liberar recursos
        scanner.close();
    }
}
