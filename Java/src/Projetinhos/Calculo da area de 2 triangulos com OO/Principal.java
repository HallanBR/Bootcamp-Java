
import java.util.Scanner;

// Update the import to the correct package where Triangulo is located
import Entities.Triangulo;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criando 2 novos triangulos, o triangulo x e o triangulo y
        Triangulo X, Y;

        X = new Triangulo();
        Y = new Triangulo();


        // Solicita ao usuário os valores dos lados do triângulo X
        System.out.println("Insira os valores dos lados do triangulo X");
        X.a = scanner.nextDouble();
        X.b = scanner.nextDouble();
        X.c = scanner.nextDouble();
        // Solicita ao usuário os valores dos lados do triângulo Y
        System.out.println("Insira os valores dos lados do triangulo Y");
        Y.a = scanner.nextDouble();
        Y.b = scanner.nextDouble();
        Y.c = scanner.nextDouble();


        //calcula a area para os triangulos X e Y
        double areaX = X.AreaTriangulo();
        double areaY = Y.AreaTriangulo();


        // Exibe as áreas calculadas dos triângulos X e Y
        System.out.println("A area do triangulo X e : " + areaX );
        System.out.println("A area do triangulo Y e : " + areaY );

        
        // Compara as áreas dos triângulos e exibe qual é o maior
        if ( areaX > areaY) {
            System.out.println("O triangulo X e maior");
        } else {
            System.out.println("O triangulo Y e maior");
        }

        scanner.close();
    }
}
