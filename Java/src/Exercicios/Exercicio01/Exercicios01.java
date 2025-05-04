package Exercicio01;
import java.util.Scanner;

public class Exercicios01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double altura;
        double largura;
    

        System.out.println("insira a altura");
        altura = scanner.nextDouble();

        System.out.println("Insira a largura");
        largura = scanner.nextDouble();


        double area = largura * altura;

        double perimetro = (largura + altura)*2;

        double diagonal = Math.sqrt(area);
        diagonal = Math.round(diagonal * 100.0) / 100.0;


        System.out.println("A area e: " + area);
        System.out.println("O perimetro e: " + perimetro);
        System.out.println("A diagonal e: " + diagonal);


        scanner.close();
    }
    
}
