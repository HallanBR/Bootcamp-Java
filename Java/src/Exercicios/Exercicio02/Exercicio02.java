import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        double salarioBruto;
        double imposto;
        double bonusPercentual;

        System.out.println("Qual o nome do funcionario");
        nome = scanner.nextLine();

        System.out.println("Qual o salario bruto do funcionario: " + nome);
        salarioBruto = scanner.nextDouble();

        System.out.println("Qual o imposto do funcionario: " + nome);
        imposto = scanner.nextDouble();

        System.out.println("Qual o percentual de bonus do funcionario: " + nome);
        bonusPercentual = scanner.nextDouble();

        double salarioLiquido = (salarioBruto - imposto);
        double adicionais = salarioLiquido + (salarioBruto * (bonusPercentual / 100));

        System.out.println("O " + nome + " recebe um salario de " + adicionais);

        scanner.close();

    }    
}
