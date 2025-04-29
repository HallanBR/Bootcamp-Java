import java.util.Scanner;

public class CalculoDeTriangulos {
    public static void main(String[] args) {

        // Criação de um objeto Scanner para leitura de dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis para armazenar os lados dos triângulos
        double xa, xb, xc, ya, yb, yc;

        // Solicita ao usuário os valores dos lados do triângulo X
        System.out.println("Insira os valores dos lados do triangulo X");
        xa = scanner.nextDouble();
        xb = scanner.nextDouble();
        xc = scanner.nextDouble();

        // Solicita ao usuário os valores dos lados do triângulo Y
        System.out.println("Insira os valores dos lados do triangulo Y");
        ya = scanner.nextDouble();
        yb = scanner.nextDouble();
        yc = scanner.nextDouble();

        // Calcula o semiperímetro e a área do triângulo X usando a fórmula de Heron
        double p = (xa + xb + xc) / 2;
        double areaX = Math.sqrt(p * (p - xa) * (p - xb) * (p - xc));

        // Calcula o semiperímetro e a área do triângulo Y usando a fórmula de Heron
        p = (ya + yb + yc) / 2;
        double areaY = Math.sqrt(p * (p - ya) * (p - yb) * (p - yc));

        // Exibe as áreas calculadas dos triângulos X e Y
        System.out.println("A area do triangulo X e : " + areaX);
        System.out.println("A area do triangulo Y e : " + areaY);

        // Compara as áreas dos triângulos e exibe qual é o maior
        if (areaX > areaY) {
            System.out.println("O triangulo X e maior");
        } else {
            System.out.println("O triangulo Y e maior");
        }

        // Fecha o objeto Scanner para liberar recursos
        scanner.close();
    }
}
